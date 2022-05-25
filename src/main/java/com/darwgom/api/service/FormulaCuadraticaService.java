package com.darwgom.api.service;

import com.darwgom.api.exception.ResourceNotFoundException;
import com.darwgom.api.model.dto.FormulaCuadraticaDto;

public interface FormulaCuadraticaService {
	
	FormulaCuadraticaDto generarFormulaCuadratica(FormulaCuadraticaDto formulaCuadraticaDto) throws ResourceNotFoundException;
	
}
