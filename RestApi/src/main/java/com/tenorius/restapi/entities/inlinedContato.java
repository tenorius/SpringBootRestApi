package com.tenorius.restapi.entities;

import java.sql.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inline", types = Contato.class)
public interface inlinedContato {
	
	 String getNome();
	 String getTelefone();
	 Operadora getOperadora();
	 Date getData();
	 String getCor();
	
}
