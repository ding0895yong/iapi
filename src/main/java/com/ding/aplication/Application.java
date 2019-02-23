package com.ding.aplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 直接运行启动微服务
 * 默认打包成jar
 * */
//添加对mapper包扫描地址
//@MapperScan("com.ding.aplication.mapper")
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {  
		SpringApplication.run(Application.class, args);
	}
	
}
