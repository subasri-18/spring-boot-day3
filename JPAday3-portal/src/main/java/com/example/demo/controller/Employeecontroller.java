package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employeeentity;
import com.example.demo.service.Employeeservices;



@RestController

public class Employeecontroller {
	
	@Autowired
	Employeeservices sser;
	
	@PostMapping("addemployee")
	public Employeeentity add(@RequestBody Employeeentity ss)
	{
		return sser.saveinfo(ss);
		
		
	}
	
	@GetMapping("showme")
	public List<Employeeentity> show(){
		return sser.showinfo();

	}
	

}
