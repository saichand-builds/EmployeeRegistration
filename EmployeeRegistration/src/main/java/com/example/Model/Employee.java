package com.example.Model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_Id_col")
	private Integer id;
	@Column(name = "emp_ename_col")
	private String ename;
	@Column(name = "emp_email_col")
	private String email;
	@Column(name = "emp_gender_col")
	private String gender;
	@Column(name = "emp_address_col")
	private String eaddr;
	@Column(name = "emp_projets_col")
	@ElementCollection
	@CollectionTable(name = "emp_proj_tab", 
	joinColumns = @JoinColumn(referencedColumnName = "emp_Id_col"))
	private List<String> prjs;

	@Column(name = "emp_slots_col")
	@ElementCollection
	@CollectionTable(name = "emp_slots_tab", 
	joinColumns = @JoinColumn(referencedColumnName = "emp_Id_col"))
	private List<String> slots;

}
