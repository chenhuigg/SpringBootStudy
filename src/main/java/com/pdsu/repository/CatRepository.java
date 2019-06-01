package com.pdsu.repository;

import org.springframework.data.repository.CrudRepository;

import com.pdsu.pojo.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer>{
	
}
