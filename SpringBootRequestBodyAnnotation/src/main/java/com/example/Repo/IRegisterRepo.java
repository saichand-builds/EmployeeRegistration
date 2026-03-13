package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Register;

public interface IRegisterRepo  extends JpaRepository<Register, Integer>{

}
