package com.example.Model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization  implements Serializable{
	
	private String name;
	private double salary;
	private Department department;
	private List<String> skills;
	private List<Projects> projects;
	

}
