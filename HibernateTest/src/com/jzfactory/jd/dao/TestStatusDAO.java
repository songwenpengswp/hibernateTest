package com.jzfactory.jd.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzfactory.jd.bean.Master;

public class TestStatusDAO extends BaseHibernateDAO {

	/**
	 * 测试临时状态到持久状态的转变
	 */
	public void testT2P()
	{
		
	}
	/**
	 * 测试临时状态到持久状态后，更改属性提交。
	 */
	public void testT2P2Update()
	{
		
	}
	/**
	 * 测试持久状态修改后提交
	 */
	public void testP2Update()
	{
		
	}
	/**
	 * 将持久态转换为游离态后更新提交
	 * clear 或 evict 或 session关闭
	 */
	public void testP2D2Update()
	{
		
	}
	/**
	 * 将持久态转换为临时态
	 */
	public void testP2T()
	{
		
	}
	/**
	 * 同步持久化对象
	 */
	public void testRefresh()
	{
		
	}
	/**
	 * 将游离态转换成持久态
	 */
	public void testD2P()
	{
		Session session=getSession();
		
		Transaction trans=session.beginTransaction();
		Master master=new Master();
		master.setId(3);
		session.update(master);
		trans.commit();
	}
	/**
	 * 持久状态修改id
	 */
	public void testP2EditId()
	{
		
	}
	/**
	 * 游离态转换为暂时状态
	 */
	public void testD2S()
	{
		
	}
	/**
	 * 测试重复的持久化对象
	 */
	public void testDuplicateP()
	{
		
	}
	/**
	 * 消除重复的持久化对象
	 */
	public void testRemoveDupli()
	{
		
	}
	
	public static void main(String[] args) {
		TestStatusDAO dao=new TestStatusDAO();
	    dao.testD2P();
	}
}
