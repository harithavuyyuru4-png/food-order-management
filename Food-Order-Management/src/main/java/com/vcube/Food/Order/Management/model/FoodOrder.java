package com.vcube.Food.Order.Management.model;



	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	import lombok.Getter;
	import lombok.Setter;

	@Entity
	@Table(name = "food_order")
	@Getter
	@Setter
	public class FoodOrder {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    Integer oid;

	    String customerName;

	    String foodName;

	    Integer quantity;

	    double price;

	    String orderStatus;
	}


