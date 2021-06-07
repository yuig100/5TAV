package com.tav.bazar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pedidos")
public class Pedidos implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@ManyToOne
	@JoinColumn(name="id_clientes",nullable = true)
	Clientes clientes;
	
	@Column(name="valorTotal")
	double valorTotal;
	
	@OneToOne
	@JoinColumn(name="id_entrega",nullable = true)
	Entrega entrega;

	public Pedidos(int id, Clientes clientes, double valorTotal, Entrega entrega) {
		super();
		this.id = id;
		this.clientes = clientes;
		this.valorTotal = valorTotal;
		this.entrega = entrega;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	
}
