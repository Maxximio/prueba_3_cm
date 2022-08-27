package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVentasRepo;
import com.example.demo.repository.model.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentasRepo ventasRepo;

	@Override
	public void insertarService(Venta venta) {
		this.ventasRepo.insertar(venta);
	}

	@Override
	public Venta buscarService(int id) {
		return this.ventasRepo.buscar(id);
	}

	@Override
	public void actualizarService(Venta venta) {
		this.ventasRepo.actualizar(venta);
	}

	@Override
	public void eliminarService(int id) {
		this.ventasRepo.eliminar(id);
	}
	
}
