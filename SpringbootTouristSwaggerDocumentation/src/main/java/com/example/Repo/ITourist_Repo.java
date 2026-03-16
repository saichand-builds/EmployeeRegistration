package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Tourist_Model;

public interface ITourist_Repo extends JpaRepository<Tourist_Model, Integer>{

}
