package com.example.Model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hotel_Orders_tab")
public class Orders  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Order_Id_Col")
	private Long OrderId;
	@Column(name = "Customer_Name_Col")
	private String CustomerName;
	@Column(name = "Order_OrderDate_Col")
	private String OrderDate;
	
	@OneToMany(mappedBy = "orders", 
			cascade = CascadeType.ALL)
	 @JsonManagedReference
	private List<OrderItems> Items;
	

}
