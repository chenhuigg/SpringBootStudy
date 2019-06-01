package com.pdsu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 使用@Entity声明其为持久化对象类
 *
 */
@Entity
public class Cat {
	@Id //指定主键
	private int t_id;
	@Column
	private String tname;
	@Column
	private int c_id;
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String t_name) {
		this.tname = t_name;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public Cat() {
	}
}
