package com.example.ServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Employee;
import com.example.Repo.IEmployeeRepo;
import com.example.Service.IEmployeeService;

@Service
public class EmployeeSerivceImple implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public Integer empRegister(Employee emp) {
		return repo.save(emp).getId();
	}

}
