package com.example.Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tourist_mode_tab")
public class Tourist_Model implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Tourist_Id_Col")
	private Integer tId;

	@Column(name = "Tourist_Name_Col")
	@NonNull
	private String tName;

	@Column(name = "Tourist_Package_Col")
	@NonNull
	private String tPackage;

	@Column(name = "Tourist_budget_Col")
	@NonNull
	private Double tBudget;

}
