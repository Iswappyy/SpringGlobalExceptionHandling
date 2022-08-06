package com.pro.wings.SpringBootExceptionHandling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.pro.wings.SpringBootExceptionHandling.dao.StudentDao;
import com.pro.wings.SpringBootExceptionHandling.entity.Student;

@RestController
public class StudentController {
	
    @Autowired
	StudentDao stdDao;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student std) {
		return stdDao.save(std);
		
	}
	@GetMapping("/all")
	public List<Student> getStudent(){
		return stdDao.findAll();
	}
	@GetMapping("/all/{id}")
	public int getStudentId(@PathVariable("id") int id) {
		
	 stdDao.findById(id);
	 return id;
	 
		
	}

}
