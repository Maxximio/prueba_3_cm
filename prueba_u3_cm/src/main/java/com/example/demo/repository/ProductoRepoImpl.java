package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Producto;
import com.example.demo.repository.model.ProductoTo;
import com.example.demo.repository.model.ProductoTo1;
import com.example.demo.repository.model.ReporteVentas;

@Transactional
@Repository
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		this.entityManager.persist(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		this.entityManager.merge(producto);
	}

	@Override
	public Producto buscar(int id) {
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public Producto buscarCodBarras(String cod) {
		TypedQuery<Producto> myQuery = this.entityManager
				.createQuery("select p from Producto p where p.codigo=:codigo", Producto.class);
		myQuery.setParameter("codigo", cod);
		try {
			return myQuery.getSingleResult();
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public void eliminar(int id) {
		Producto p=this.buscar(id);
		this.entityManager.remove(p);
	}

	@Override
	public List<ProductoTo1> buscarTodos() {
		TypedQuery<ProductoTo1>miTypedQuery= this.entityManager
				.createQuery("select NEW com.example.demo.repository.model"
						+ ".ProductoTo1(p.codigo,p.stock) from Producto p ",ProductoTo1.class);

		return miTypedQuery.getResultList();
	}

	@Override
	public ProductoTo buscarCodBarrasTo(String cod) {
		
		TypedQuery<ProductoTo>miTypedQuery= this.entityManager
				.createQuery("select NEW com.example.demo.repository.model"
						+ ".ProductoTo1(p.codigo,p.nombre,p.stock) from Producto p "
						+ "where p.codigo=:datoCodigo",ProductoTo.class);
		miTypedQuery.setParameter("datoCodigo", cod);
		return miTypedQuery.getSingleResult();
	}
	
	@Override
	public ReporteVentas GenerarReporte(LocalDateTime fechaVenta, String categoria, int cantidad) {
		
		
		return null;
	}
}
