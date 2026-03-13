package com.example.Model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Order_Items_Tab")
public class OrderItems  implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Item_Id_Col")
	private Long  ItemId;
	@Column(name = "Item_Product_Name_Col")
	private String ProdutName;
	@Column(name = "Item_Price_Col")
	private double price;
	
		@ManyToOne
		@JoinColumn(name = "Order_Id_Col")
		@JsonManagedReference
		private Orders orders;
		
	

}
