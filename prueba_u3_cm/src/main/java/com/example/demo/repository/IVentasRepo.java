package com.example.demo.repository;

import com.example.demo.repository.model.Venta;

public interface IVentasRepo {

	void insertar(Venta venta);

	Venta buscar(int id);

	void actualizar(Venta venta);

	void eliminar(int id);
	
}
