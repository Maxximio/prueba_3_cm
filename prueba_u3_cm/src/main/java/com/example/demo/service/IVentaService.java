package com.example.demo.service;

import com.example.demo.repository.model.Venta;

public interface IVentaService {

	void insertarService(Venta venta);

	Venta buscarService(int id);

	void actualizarService(Venta venta);

	void eliminarService(int id);
	
}
