package com.tav.bazar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Enderecos")
public class Enderecos implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="endereco")
	String endereco;
	
	@OneToOne
	@JoinColumn(name="id_clientes",nullable = true)
	Clientes clientes;
	
	@OneToOne
	@JoinColumn(name="id_entrega",nullable = true)
	Entrega entrega;

	public Enderecos(int id, String endereco, Clientes clientes, Entrega entrega) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.clientes = clientes;
		this.entrega = entrega;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	
	
}
