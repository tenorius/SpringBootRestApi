package com.tenorius.restapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@Entity
public class Operadora {

	@Id
	private String nome;
	private int codigo;
	private String categoria;
	private double preco;
	
	public Operadora(){
		
	}
	
	@JsonCreator
	public Operadora(@JsonProperty("nome") String nome, @JsonProperty("codigo")int codigo, @JsonProperty("categoria")String categoria,@JsonProperty("preco") double preco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
