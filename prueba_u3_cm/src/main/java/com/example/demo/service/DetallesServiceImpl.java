package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDetallesRepo;
import com.example.demo.repository.model.DetalleVenta;

@Service
public class DetallesServiceImpl implements IDetallesService{

	@Autowired
	private IDetallesRepo detallesRepo;

	@Override
	public void insertarService(DetalleVenta detalleVenta) {
		this.detallesRepo.insertar(detalleVenta);
	}

	@Override
	public DetalleVenta buscarService(int id) {
		return this.detallesRepo.buscar(id);
	}

	@Override
	public void actualizarService(DetalleVenta detalleVenta) {
		this.detallesRepo.actualizar(detalleVenta);
	}

	@Override
	public void eliminarService(int id) {
		this.detallesRepo.eliminar(id);
	}
	
}
