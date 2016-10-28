package com.jzfactory.jd.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



/**
 * Clasz entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "clasz", catalog = "school_hibernate")
public class Clasz implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String local;
	private Set<Student> students = new HashSet<Student>(0);
	private Master master;

	// Constructors

	/** default constructor */
	public Clasz() {
	}

	/** full constructor */
	public Clasz(String name, String local, Set<Student> students, Master master) {
		this.name = name;
		this.local = local;
		this.students = students;
		this.master = master;
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

	@Column(name = "name", length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "local", length = 30)
	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@OneToMany( fetch = FetchType.EAGER, mappedBy = "clasz")
	@Cascade({CascadeType.PERSIST,CascadeType.DELETE})
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "master_id")
	public Master getMaster() {
		return this.master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

}