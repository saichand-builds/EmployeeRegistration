package com.example.Model;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Register {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Register_ID_Col")
	private Integer Id;
	@Column(name = "Register_Name_Col")
	private String Name;
	@Column(name = "Register_Salary_Col")
	private double Salary;
	
	@Column(name = "Register_Designation_Col")
//	@ElementCollection
//	@CollectionTable(name = "Registration_Designation_tab", 
 //   joinColumns = @JoinColumn(referencedColumnName = "Register_ID_Col"))
//  @ElementCollection    can applied only for Collections like(Set ,List,Map)
	private String designation;

}
