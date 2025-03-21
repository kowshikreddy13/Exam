package com.mru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mru.entity.Student;
import com.mru.repo.StudentRepository;

@Service
public class StudentServ {
	@Autowired
private StudentRepository repo;
	
	public List<Student> getAllLaptops(){
		return repo.findAll();
		
	}
}
