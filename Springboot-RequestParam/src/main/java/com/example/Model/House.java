package com.example.Model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class House implements Serializable {

	private Integer drNno;
	private String name;
	private double cost;
	private Integer no;
	 private House message;
	 private Object data;
	 
	 public House(House house, Object data) {
		super();
		this.message = house;
		this.data = data;
	 }

	 
}
