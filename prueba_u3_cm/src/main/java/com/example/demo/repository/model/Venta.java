package com.example.demo.repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vent")
	@SequenceGenerator(name = "seq_vent", sequenceName = "seq_vent", allocationSize = 1)
	@Column(name = "vent_id")
	private Integer Id;

	@Column(name = "vent_numero")
	private String numero;

	@Column(name = "vent_fecha")
	private LocalDateTime fecha;

	@Column(name = "vent_cedula")
	private String cedula;

	@Column(name = "vent_venta")
	private BigDecimal venta;

	@OneToMany(mappedBy = "idVenta", cascade = CascadeType.ALL)
	private List<DetalleVenta> detalleVentas;

	//set y get
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public BigDecimal getVenta() {
		return venta;
	}

	public void setVenta(BigDecimal venta) {
		this.venta = venta;
	}

	public List<DetalleVenta> getListaVentas() {
		return detalleVentas;
	}

	public void setListaVentas(List<DetalleVenta> detalleVentas) {
		this.detalleVentas = detalleVentas;
	}

	//to string
	@Override
	public String toString() {
		return "Venta [Id=" + Id + ", numero=" + numero + ", fecha=" + fecha + ", cedula=" + cedula + ", venta=" + venta
				+ "]";
	}
	
}
