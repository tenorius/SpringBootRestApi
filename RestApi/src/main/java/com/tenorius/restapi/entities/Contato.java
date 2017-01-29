package com.tenorius.restapi.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Contato {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private long id;
	private String nome;
	private Date data;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Operadora operadora;
	private String telefone;
	private String cor;
	
	
	public Contato(){
		
	}
	
	@JsonCreator
	public Contato(@JsonProperty("nome")String nome, @JsonProperty("data") Date data,  @JsonProperty("operadora") Operadora operadora,  @JsonProperty("telefone")String telefone,  @JsonProperty("cor")String cor) {
		super();
		this.nome = nome;
		this.data = data;
		this.operadora = operadora;
		this.telefone = telefone;
		this.cor = cor;
	}
	
//	@JsonCreator
//	public Contato( @JsonProperty("nome")String nome, @JsonProperty("telefone")String telefone) {
//		super();
//		this.nome = nome;
//		this.telefone = telefone;
//	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	public Operadora getOperadora() {
		return operadora;
	}
	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
