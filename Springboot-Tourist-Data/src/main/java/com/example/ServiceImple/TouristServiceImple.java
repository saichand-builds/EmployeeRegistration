package com.example.ServiceImple;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Model.Tourist_Model;
import com.example.Repo.ITourist_Repo;
import com.example.Service.ITouristService;

@Service
public class TouristServiceImple implements ITouristService {

	@Autowired
	private ITourist_Repo repo;

	@Override
	public String touristRegister(Tourist_Model Tm) {

		String Id = "Tourist is saved " + repo.save(Tm).getTId();

		return Id;
	}

	/*
	 * @Override public List<Tourist_Model> fetechAllTourist() {
	 * 
	 * List<Tourist_Model> list = repo.findAll();
	 * 
	 * list.sort((t1, t2) -> t1.getTId().compareTo(t2.getTId())); return list; }
	 */

	public List<Tourist_Model> fetechAllTourist() {

		return repo.findAll(Sort.by(Sort.Direction.ASC, "tId"));
		
		
	}

	@Override
	public Tourist_Model fetchTouristById(Integer Id) {
		
		return repo.findById(Id).orElseThrow(() -> new NoSuchElementException("Tourist not found "+Id));
	}
}
