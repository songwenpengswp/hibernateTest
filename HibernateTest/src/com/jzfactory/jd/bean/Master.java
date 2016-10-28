package com.jzfactory.jd.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Master entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(catalog = "school_hibernate")
public class Master implements java.io.Serializable {

	// Fields

	private Integer id;
	private Clasz clasz;
	private String name;
	private Integer sex;
	

	// Constructors

	/** default constructor */
	public Master() {
	}

	/** full constructor */
	public Master(Clasz clasz, String name, Integer sex) {
		this.clasz = clasz;
		this.name = name;
		this.sex = sex;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "master")
	public Clasz getClasz() {
		return this.clasz;
	}

	public void setClasz(Clasz clasz) {
		this.clasz = clasz;
	}

	@Column(name = "name", length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
	

	
}