package com.darwgom.api.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darwgom.api.exception.ResourceNotFoundException;
import com.darwgom.api.model.FormulaCuadratica;
import com.darwgom.api.model.dto.FormulaCuadraticaDto;
import com.darwgom.api.repository.FormulaCuadraticaRepository;
import com.darwgom.api.service.FormulaCuadraticaService;

@Service
public class FormulaCuadraticaServiceImpl implements FormulaCuadraticaService {

	@Autowired
	private FormulaCuadraticaRepository formulaCuadraticaRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	private static final String RECURSO_NO_ENCONTRADO = "Resultado no procesado";
	
	@Override
	public FormulaCuadraticaDto generarFormulaCuadratica(FormulaCuadraticaDto formulaCuadraticaDto) throws ResourceNotFoundException {
		String resultadoFormulaCuadratica = calcularFormulaCuadratica(formulaCuadraticaDto.getValorA(), formulaCuadraticaDto.getValorB(), formulaCuadraticaDto.getValorC());
		if (resultadoFormulaCuadratica.isEmpty()) {
			throw new ResourceNotFoundException(RECURSO_NO_ENCONTRADO);
		}
		formulaCuadraticaDto.setResultado(resultadoFormulaCuadratica);
		return modelMapper.map(formulaCuadraticaRepository.save(modelMapper.map(formulaCuadraticaDto, FormulaCuadratica.class)), FormulaCuadraticaDto.class);
	}
	
	public String calcularFormulaCuadratica(Long valorA, Long valorB, Long valorC) {
		Double resultadoUno;
		Double resultadoDos;
		Double potencia;
		
		potencia = Math.pow(valorB, 2) - (4 * valorA * valorC);
		
		resultadoUno = (-valorB - Math.sqrt(potencia)/ 2 * valorA);
		
		resultadoDos = (-valorB + Math.sqrt(potencia)/ 2 * valorA);
	    
	    
	    return resultadoUno.toString().concat(", ").concat(resultadoDos.toString());
	}

}



