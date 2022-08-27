package com.example.demo.repository.model;

import java.math.BigDecimal;

public class ReporteVentas {

	private String codigo;
	private String nombre;
	private int cantidad;
	private BigDecimal precioUnitario;
	private BigDecimal subtotal;
	
	public ReporteVentas(String codigo, String nombre, int cantidad, BigDecimal precioUnitario, BigDecimal subtotal) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	//to string
	@Override
	public String toString() {
		return "ReporteVentas [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario="
				+ precioUnitario + ", subtotal=" + subtotal + "]";
	}
	
}
