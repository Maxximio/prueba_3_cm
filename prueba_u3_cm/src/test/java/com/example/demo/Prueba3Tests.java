package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(true)
@Transactional
class Prueba3Tests {
	
	@Autowired
	//private ITransferenciaService transferenciaService;
	
	@Test
	void contextLoads() {	
		
		//CuentaBancaria c3=this.transferenciaService.buscarPorNumero("111");
		
		
		//assertEquals(new BigDecimal(200.55), c3.getSaldo());
		
	}
	
	@BeforeEach
	void datos() {
		
		
		
	}

}
