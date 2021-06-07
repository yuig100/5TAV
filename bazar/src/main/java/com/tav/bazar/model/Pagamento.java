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
@Table(name = "Pagamento")
public class Pagamento  implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToOne
	@JoinColumn(name="id_clientes",nullable = true)
	Clientes clientes;
	
	@OneToOne
	@JoinColumn(name="id_pedidos",nullable = true)
	Pedidos pedidos;

	public Pagamento(int id, Clientes clientes, Pedidos pedidos) {
		super();
		this.id = id;
		this.clientes = clientes;
		this.pedidos = pedidos;
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

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	
	
}
