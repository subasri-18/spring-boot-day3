package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employeeentity;

import com.example.demo.repository.Employeerepo;

@Service

public class Employeeservices {
	
	@Autowired
	Employeerepo sr;
	
	public Employeeentity saveinfo(Employeeentity ss)
	{
		return sr.save(ss);
	}
	public List<Employeeentity> showinfo()
	{
		return sr.findAll();
	}


}