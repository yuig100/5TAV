package com.tav.bazar.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Clientes implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="nome")
	String nome;
	
	@OneToMany
	@JoinColumn(name="id_pedidos",nullable = true)
	List<Pedidos> pedidos;
	
	@OneToOne
	@JoinColumn(name="id_pagamento",nullable = true)
	Pagamento pagamento;
	
	@OneToOne
	@JoinColumn(name="id_enderecos",nullable = true)
	Enderecos enderecos;
	
	@OneToMany
	@JoinColumn(name="id_carrinho",nullable = true)
	List<Carrinho> carrinho;

	public Clientes(int id, String nome, List<Pedidos> pedidos, Pagamento pagamento, Enderecos enderecos,
			List<Carrinho> carrinho) {
		super();
		this.id = id;
		this.nome = nome;
		this.pedidos = pedidos;
		this.pagamento = pagamento;
		this.enderecos = enderecos;
		this.carrinho = carrinho;
	}

	public Clientes() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Enderecos getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Enderecos enderecos) {
		this.enderecos = enderecos;
	}

	public List<Carrinho> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(List<Carrinho> carrinho) {
		this.carrinho = carrinho;
	}

	
}
