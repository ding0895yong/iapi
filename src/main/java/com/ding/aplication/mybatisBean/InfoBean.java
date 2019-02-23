package com.ding.aplication.mybatisBean;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

   /**
    * info 实体类
    * Sat May 05 13:19:01 GMT+08:00 2018 dingyong
    */ 

public class InfoBean implements Serializable{
	private long id;
	private String name;
	private String unit;
	private int age;
	private String yySs;
	
	public InfoBean(){}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getYySs() {
		return yySs;
	}

	public void setYySs(String yySs) {
		this.yySs = yySs;
	}

}

