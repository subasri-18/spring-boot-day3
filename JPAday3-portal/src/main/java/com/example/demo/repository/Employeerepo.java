package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employeeentity;

public interface Employeerepo extends JpaRepository<Employeeentity ,Integer> {

}
