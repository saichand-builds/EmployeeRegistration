package com.example.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Register;
import com.example.Repo.IRegisterRepo;
import com.example.Service.IRegisterService;

@Service
public class RegisterServiceImple implements IRegisterService {

	@Autowired
	private IRegisterRepo repo;

	@Override
	public Integer saveRegister(Register regis) {
		return repo.save(regis).getId();
	}

}
