package com.ding.aplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ding.aplication.mapper.InfoMapper;
import com.ding.aplication.mybatisBean.InfoBean;
import com.ding.aplication.repository.InfoRepository;

@RestController
public class TestController {

	@Autowired
	InfoRepository infoRepo;
	@Autowired
	InfoMapper infomapper;
	
	@RequestMapping(value = "/japTest", method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String japTest(){
		String str = "";
		try {
			str = "infoRepo=============" + infoRepo.findAll().size();
			System.out.println(str);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return str;
	}
	
	@RequestMapping(value = "/mybatisTest", method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String mybatisTest() {
		String str = "";
		try {
			List<InfoBean> list = infomapper.getUserList();
			str = "mybatisTest=============" + list.size();
			System.out.println(str);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return str;
	}
}
