package com.darwgom.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.darwgom.api.model.dto.FormulaCuadraticaDto;
import com.darwgom.api.service.FormulaCuadraticaService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("api/v1")
public class FormulaCuadraticaController {
	
	@Autowired
	private FormulaCuadraticaService formulaCuadraticaService;
	
	@PostMapping("/formulacuadratica")
	public FormulaCuadraticaDto generarFormulaCuadratica(@RequestBody FormulaCuadraticaDto formulaCuadraticaDto) {
		return formulaCuadraticaService.generarFormulaCuadratica(formulaCuadraticaDto);
	}
	
}
