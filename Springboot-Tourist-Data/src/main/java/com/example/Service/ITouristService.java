package com.example.Service;

import java.util.List;

import com.example.Model.Tourist_Model;

public interface ITouristService {

	public String touristRegister(Tourist_Model Tm);
	
	public List<Tourist_Model> fetechAllTourist();
	
	public Tourist_Model fetchTouristById(Integer Id);

}
