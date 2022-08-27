package com.example.demo.service;

import com.example.demo.repository.model.DetalleVenta;

public interface IDetallesService {

	void insertarService (DetalleVenta detalleVenta);

	DetalleVenta buscarService (int id);

	void actualizarService (DetalleVenta detalleVenta);

	void eliminarService (int id);
	
}
