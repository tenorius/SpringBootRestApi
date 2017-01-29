package com.tenorius.restapi.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inline", types = Operadora.class)
public interface inlinedOperadora {
	
	 String getNome();		
	
}
