package com.darwgom.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.darwgom.api.service.impl.FormulaCuadraticaServiceImpl;

@SpringBootTest
class FormulaCuadraticaApiApplicationTests {
	@Autowired
	private FormulaCuadraticaServiceImpl formulaCuadraticaServiceImplService;
	
	@Test
	void testValidarResultadoFormulaCuadratica() {
		assertEquals("-20.24744871391589, 4.24744871391589", formulaCuadraticaServiceImplService.calcularFormulaCuadratica(5L, 8L, 2L));
	}

}
