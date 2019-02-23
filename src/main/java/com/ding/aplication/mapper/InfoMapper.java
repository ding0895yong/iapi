package com.ding.aplication.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ding.aplication.mybatisBean.InfoBean;

@Mapper
public interface InfoMapper {

	@Select("SELECT * FROM info WHERE id = #{id}")
	InfoBean getUserById(Integer id);

	@Select("SELECT * FROM info")
	public List<InfoBean> getUserList();

	@Insert("insert into info(username, age) values(#{username}, #{age})")
	public int add(InfoBean user);

	@Update("UPDATE info SET name = #{user.name} , age = #{user.age} WHERE id = #{id}")
	public int update(@Param("id") Integer id, @Param("user") InfoBean user);

	@Delete("DELETE from info where id = #{id} ")
	public int delete(Integer id);
}
