package com.pdsu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.pdsu.pojo.Cat;


//@Repository
public interface CatDao {
	
	@Select("select * from cat")
	public List<Cat> getallcat();

}
