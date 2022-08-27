package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProyectoU3CmApplication;
import com.example.demo.repository.model.DetalleVenta;
import com.example.demo.repository.model.Producto;
import com.example.demo.repository.model.ProductoTo;
import com.example.demo.repository.model.ProductoTo1;
import com.example.demo.repository.model.Venta;

@Service
public class GestorSupermercadoServiceImpl implements IGestorSupermercadoService{

	private static final Logger log =LoggerFactory.getLogger(GestorSupermercadoServiceImpl.class);
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IVentaService ventaService;
	
	@Autowired
	private IDetallesService detallesService;

	
	//////////////////////////////////f1///////////////////////////////////
	@Override
	public void insertarProducto(Producto producto) {
		
		String codigo=producto.getCodigo();
		
		Producto p = this.productoService.buscarCodBarrasService(codigo);

		if (p != null) {
			int stockNuevo=p.getStock()+producto.getStock();
			p.setStock(stockNuevo);
			
			this.productoService.actualizarService(producto);
			log.info("stock de producto actualizado");
			
			
			
		} else {
			
			this.productoService.insertarService(producto);
			log.info("producto nuevo ingresado");
		}
		
	}
	//////////////////////////////////f2///////////////////////////////////


	@Override
	public void realizarVenta(List<ProductoTo1> lista, String cedula, String numeroVenta) {
		
		for(ProductoTo1 pLista:lista) {
			Producto productoUnitario=this.productoService.buscarCodBarrasService(pLista.getCodigo());
			
			if(pLista.getStock()<=productoUnitario.getStock()) {
				
				Venta venta = new Venta();
				venta.setCedula(cedula);
				venta.setFecha(LocalDateTime.now());
				venta.setNumero(numeroVenta);

				List<DetalleVenta> listaVenta = new ArrayList<>();
				DetalleVenta detalle = new DetalleVenta();
				detalle.setCantidad(pLista.getStock());
				detalle.setIdProducto(productoUnitario);
				detalle.setIdVenta(venta);
				detalle.setPrecioUnitario(productoUnitario.getPrecio());
				detalle.setSubtotal(productoUnitario.getPrecio().multiply(new BigDecimal(productoUnitario.getStock())));

				listaVenta.add(detalle);
				venta.setListaVentas(listaVenta);

				this.ventaService.insertarService(venta);
				this.detallesService.insertarService(detalle);
				
				productoUnitario.setStock(productoUnitario.getStock()-pLista.getStock());
				this.productoService.actualizarService(productoUnitario);
			
			}if(pLista.getStock()>productoUnitario.getStock()) {
			
				int restado=pLista.getStock()-productoUnitario.getStock();
				
				Venta venta = new Venta();
				venta.setCedula(cedula);
				venta.setFecha(LocalDateTime.now());
				venta.setNumero(numeroVenta);

				List<DetalleVenta> listaVenta = new ArrayList<>();
				DetalleVenta detalle = new DetalleVenta();
				detalle.setCantidad(pLista.getStock());
				detalle.setIdProducto(productoUnitario);
				detalle.setIdVenta(venta);
				detalle.setPrecioUnitario(productoUnitario.getPrecio());
				detalle.setSubtotal(productoUnitario.getPrecio().multiply(new BigDecimal(productoUnitario.getStock())));

				listaVenta.add(detalle);
				venta.setListaVentas(listaVenta);

				this.ventaService.insertarService(venta);
				this.detallesService.insertarService(detalle);
				
				productoUnitario.setStock(productoUnitario.getStock()-restado);
				this.productoService.actualizarService(productoUnitario);
				
			}else {
				
				throw new RuntimeException();
			}
		}
	}

	//////////////////////////////////f3///////////////////////////////////
	
	@Override
	public ProductoTo consultarStock(String codigoBarras) {
		return this.productoService.buscarCodBarrasToService(codigoBarras);
	}

	//////////////////////////////////f4///////////////////////////////////

	@Override
	public void reporteVentas(LocalDateTime fechaVenta, String categoria, int cantidad) {
		
		
		
	}
	
	
}
