package com.example.demo.repository.model;

public class ProductoTo {

	private String codigo;
	private String nombre;
	private int stock;
	
	//constructor
	public ProductoTo(String codigo, String nombre, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
	}

	//set y get
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "ProductoTo [codigo=" + codigo + ", nombre=" + nombre + ", stock=" + stock + "]";
	}
	
}
