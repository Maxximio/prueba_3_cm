package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.model.Producto;
import com.example.demo.repository.model.ProductoTo;
import com.example.demo.repository.model.ProductoTo1;

public interface IGestorSupermercadoService {

	public void insertarProducto(Producto producto);
	
	public void realizarVenta(List<ProductoTo1> lista, String cedula, String numeroVenta);
	
	public ProductoTo consultarStock(String codigoDeBarras);
	
	public void reporteVentas(LocalDateTime fechaVenta, String categoria, int cantidad);
}
