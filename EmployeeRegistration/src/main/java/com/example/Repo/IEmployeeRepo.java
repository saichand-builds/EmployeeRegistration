package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Employee;

public interface IEmployeeRepo  extends JpaRepository<Employee, Integer> {

}
