package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.model.Producto;
import com.example.demo.repository.model.ProductoTo;
import com.example.demo.repository.model.ProductoTo1;

public interface IProductoService {

	public void insertarService(Producto producto);
	
	public Producto buscarService(int id);
	
	public Producto buscarCodBarrasService(String cod);
	
	public void actualizarService(Producto producto);
	
	public void eliminarService(int id);
	
	public List<ProductoTo1> buscarTodos();
	
	public ProductoTo buscarCodBarrasToService(String cod);
	
}
