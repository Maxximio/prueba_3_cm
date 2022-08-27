package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepo;
import com.example.demo.repository.model.Producto;
import com.example.demo.repository.model.ProductoTo;
import com.example.demo.repository.model.ProductoTo1;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo productoRepo;

	@Override
	public void insertarService(Producto producto) {
		this.productoRepo.insertar(producto);
	}

	@Override
	public Producto buscarService(int id) {
		return this.productoRepo.buscar(id);
	}

	@Override
	public Producto buscarCodBarrasService(String cod) {
		return this.productoRepo.buscarCodBarras(cod);
	}

	@Override
	public void actualizarService(Producto producto) {
		this.productoRepo.actualizar(producto);
	}

	@Override
	public void eliminarService(int id) {
		this.productoRepo.eliminar(id);
	}

	@Override
	public List<ProductoTo1> buscarTodos() {
		return this.productoRepo.buscarTodos();
	}

	@Override
	public ProductoTo buscarCodBarrasToService(String cod) {
		return this.productoRepo.buscarCodBarrasTo(cod);
	}
	
	
	
}
