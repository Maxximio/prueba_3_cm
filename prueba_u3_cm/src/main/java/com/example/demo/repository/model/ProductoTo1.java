package com.example.demo.repository.model;

public class ProductoTo1 {

	private String codigo;
	private int stock;
	
	//constructor
	public ProductoTo1(String codigo, int stock) {
		super();
		this.codigo = codigo;
		this.stock = stock;
	}

	//set y get
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	//to string
	@Override
	public String toString() {
		return "ProductoTo [codigo=" + codigo + ", stock=" + stock + "]";
	}
}
