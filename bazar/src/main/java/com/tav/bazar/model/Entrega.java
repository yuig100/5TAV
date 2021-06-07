package com.tav.bazar.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Entrega")
public class Entrega  implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToOne
	@JoinColumn(name="id_enderecos",nullable = true)
	Enderecos enderecos;
	
	@OneToOne
	@JoinColumn(name="id_pedidos",nullable = true)
	Pedidos pedidos;

	public Entrega(int id, Enderecos enderecos, Pedidos pedidos) {
		super();
		this.id = id;
		this.enderecos = enderecos;
		this.pedidos = pedidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Enderecos getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Enderecos enderecos) {
		this.enderecos = enderecos;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	
}
