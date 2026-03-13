package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Orders;

public interface IoderRepository  extends JpaRepository<Orders, Long>{

}
