package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.DetalleVenta;

@Transactional
@Repository
public class DetalleVentaRepoImpl implements IDetallesRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(DetalleVenta detalleVenta) {
		this.entityManager.persist(detalleVenta);
	}

	@Override
	public DetalleVenta buscar(int id) {
		return this.entityManager.find(DetalleVenta.class, id);
	}

	@Override
	public void actualizar(DetalleVenta detalleVenta) {
		this.entityManager.merge(detalleVenta);
	}

	@Override
	public void eliminar(int id) {
		DetalleVenta d=this.buscar(id);
		this.entityManager.remove(d);
	}
	
	
	
}
