package com.example.demo.repository;

import com.example.demo.repository.model.DetalleVenta;

public interface IDetallesRepo {

	void insertar(DetalleVenta detalleVenta);

	DetalleVenta buscar(int id);

	void actualizar(DetalleVenta detalleVenta);

	void eliminar(int id);
	
}
