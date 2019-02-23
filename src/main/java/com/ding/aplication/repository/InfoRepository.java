package com.ding.aplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ding.aplication.jpaEntity.Info;
/**
 * 数据访问层
 * */
public interface InfoRepository extends JpaRepository<Info, Long> {

	//spring data jpa 默认预先生成了一些基本的CURD的方法，例如：增、删、改,还可以根据方法名来自动生成SQL，具体去网上查查
	
}
