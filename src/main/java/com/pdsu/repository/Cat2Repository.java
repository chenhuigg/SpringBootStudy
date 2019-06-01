package com.pdsu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.pdsu.pojo.Cat;

public interface Cat2Repository extends Repository<Cat, Integer>{
	
	/**
	 * 查询方法以get find read开头
	 * 条件属性以条件关键字连接，条件关键字首字母大写
	 */
	//根据t_name进行查询
	public Cat findCatByTname(String t_name);
	
	/**
	 * 编写JPQL语句
	 * JPQL语句与HQL语句类似
	 */
	@Query("from Cat where cname=:cname")
	public Cat findMyCatName(String cname);
	
	public void deleteByTname(String t_name);
}
