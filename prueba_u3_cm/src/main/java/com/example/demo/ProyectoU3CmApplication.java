package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.model.Producto;
import com.example.demo.service.IGestorSupermercadoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class ProyectoU3CmApplication implements CommandLineRunner{
	
	private static final Logger log =LoggerFactory.getLogger(ProyectoU3CmApplication.class);
	
	@Autowired
	IGestorSupermercadoService gestorSupermercadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU3CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		// ingreso
//		Producto p1 = new Producto();
//		p1.setCategoria("Lacteos");
//		p1.setCodigo("111");
//		p1.setNombre("Queso");
//		p1.setPrecio(new BigDecimal(2.50));
//		p1.setStock(10);
//
//		Producto p2 = new Producto();
//		p2.setCategoria("Lacteos");
//		p2.setCodigo("111");
//		p2.setNombre("Queso");
//		p2.setPrecio(new BigDecimal(2.50));
//		p2.setStock(10);
//
//		this.gestorSupermercadoService.insertarProducto(p1);
//		this.gestorSupermercadoService.insertarProducto(p2);
		
		
		
		//this.gestorSupermercadoService.realizarVenta(null, null, null);
		
		
		this.gestorSupermercadoService.consultarStock("111");
	}

}
