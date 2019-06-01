package com.pdsu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdsu.dao.CatDao;
import com.pdsu.pojo.Cat;
import com.pdsu.service.CatService;


@RestController
@RequestMapping("/cat")
public class CatController {
	
	@Resource
	private CatService catService;
	
	@Resource
	private CatDao catDao;
	
	@RequestMapping("/save")
	public void save() {
		Cat cat=new Cat();
		cat.setC_id(1);
		cat.setTname("jack");
		catService.save(cat);
	}
	
	@RequestMapping("/delete")
	public void delete() {
		catService.delete(1);
	}
	
	@RequestMapping("/getAll")
	public Iterable<Cat> getAll(){
		return catService.getAll();
	}
	
	@RequestMapping("/findCatByTName")
	public Cat findCatByTName(String t_name) {
		return catService.findCatByTName(t_name);
	}
	
	@RequestMapping("/findCatByTName2")
	public Cat findCatByTName2(String t_name) {
		return catService.findCatByTName(t_name);
	}
	
	/*@RequestMapping("/deleteByTname")
	public void DeleteByTname(String t_name) {
		catService.DeleteByTname(t_name);
	}*/
	
	@RequestMapping("/getallcat")
	public List<Cat> getallcat(){
		return catDao.getallcat();
	}

}
