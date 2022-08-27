package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Venta;

@Repository
@Transactional
public class VentaRepoImpl implements IVentasRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Venta venta) {
		this.entityManager.persist(venta);
	}

	@Override
	public Venta buscar(int id) {
		return this.entityManager.find(Venta.class, id);
	}

	@Override
	public void actualizar(Venta venta) {
		this.entityManager.merge(venta);
	}

	@Override
	public void eliminar(int id) {
		Venta v=this.buscar(id);
		this.entityManager.remove(v);
	}

	
	
}
