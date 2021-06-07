package com.tav.bazar.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "Carrinho")
public class Carrinho  implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="data_compra")
	Date dataCompra;
	
	@Column(name="valor")
	double valor;
	
	@OneToOne
	@JoinColumn(name="id_frete",nullable = true)
	Frete frete;
		
	@ManyToOne
	@JoinColumn(name="id_clientes",nullable = true)
	Clientes clientes;

	public Carrinho(int id, Date dataCompra, double valor, Frete frete, Clientes clientes) {
		super();
		this.id = id;
		this.dataCompra = dataCompra;
		this.valor = valor;
		this.frete = frete;
		this.clientes = clientes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
}
