package com.ing.catalog.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table

public class Product implements Serializable {

	private static final long serialVersionUID = 7771935079393339855L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private int categoryId;
	private String productName;
	private String productDescription;
	private double charges;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Product(int productId, int categoryId, String productName, String productDescription, double charges) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.charges = charges;
	}

	public Product() {
		
	}
	
}
