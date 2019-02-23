package com.ding.aplication.jpaEntity;

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

@Entity
@Table(name="info")
public class Info implements Serializable{
	private long id;
	private String name;
	private String unit;
	private int age;
	private String yySs;
	
	public Info(){}
	
	@Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	//验证名称不能为空
	@NotNull(message="name type must be specified.")
	@Column(name="name", length=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//使用正则表达式验证数据
//	@Pattern(regexp = ".*\\.jpg|.*\\.jpeg|.*\\.gif", message="Only images of type JPEG or GIF are supported.")
	@Column(name="unit", length=50)
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name="age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name="yy_ss", length=20)
	public String getYySs() {
		return yySs;
	}

	public void setYySs(String yySs) {
		this.yySs = yySs;
	}

}

