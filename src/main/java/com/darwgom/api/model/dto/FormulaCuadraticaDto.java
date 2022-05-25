package com.darwgom.api.model.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormulaCuadraticaDto implements Serializable {
	
	private Long id;
	
	private Long valorA;
	
	private Long valorB;
	
	private Long valorC;
	
	private String resultado;
	
	private static final long serialVersionUID = 1L;
	
}
