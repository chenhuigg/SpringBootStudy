package com.pdsu.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdsu.pojo.Cat;
import com.pdsu.repository.Cat2Repository;
import com.pdsu.repository.CatRepository;

@Service
public class CatService {
	@Resource
	private CatRepository catRepository;
	
	@Resource
	private Cat2Repository cat2Repository;
	
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}
	
	@Transactional
	public void delete(int id) {
		catRepository.deleteById(id);
	}
	
	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}
	
	public Cat findCatByTName(String t_name) {
		return cat2Repository.findCatByTname(t_name);
	}
	
	public Cat findCatByTName2(String t_name) {
		return cat2Repository.findMyCatName(t_name);
	}
	
	public void DeleteByTname(String t_name) {
		cat2Repository.deleteByTname(t_name);
	}
	
}
