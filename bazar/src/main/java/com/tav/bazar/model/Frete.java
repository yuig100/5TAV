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
@Table(name = "Frete")
public class Frete  implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToOne
	@JoinColumn(name="id_pedidos",nullable = true)
	Pedidos pedidos;
	
	@Column(name="preco")
	double preco;

	public Frete(int id, Pedidos pedidos, double preco) {
		super();
		this.id = id;
		this.pedidos = pedidos;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calcular_frete(double distancia) {
		
		return distancia * 10;
		
	}
	
}
