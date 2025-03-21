package com.mru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mru.entity.Student;
import com.mru.service.StudentServ;

@RestController
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentServ ser;
	@GetMapping("/student")
	public List<Student> getLaptops(){
		return ser.getAllLaptops();
	}
}
