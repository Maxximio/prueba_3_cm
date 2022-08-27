package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.model.Producto;
import com.example.demo.repository.model.ProductoTo;
import com.example.demo.repository.model.ProductoTo1;
import com.example.demo.repository.model.ReporteVentas;

public interface IProductoRepo {

	public void insertar(Producto producto);
	
	public Producto buscar(int id);
	
	public Producto buscarCodBarras(String cod);
	
	public void actualizar(Producto producto);
	
	public void eliminar(int id);
	
	public List<ProductoTo1> buscarTodos();
	
	public ProductoTo buscarCodBarrasTo(String cod);

	public ReporteVentas GenerarReporte(LocalDateTime fechaVenta, String categoria, int cantidad);
}
