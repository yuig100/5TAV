package com.tav.bazar.model;

public class Pagamento {
	
	int id;
	int id_Cliente;
	int id_Pedidos;
	
	public Pagamento(int id, int id_Cliente, int id_Pedidos) {
		super();
		this.id = id;
		this.id_Cliente = id_Cliente;
		this.id_Pedidos = id_Pedidos;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public int getId_Pedidos() {
		return id_Pedidos;
	}

	public void setId_Pedidos(int id_Pedidos) {
		this.id_Pedidos = id_Pedidos;
	}


	public double fazer_pagamento(Carrinho carrinho) {
		
		
		double total_a_pagar=carrinho.valorTotal + carrinho.frete;
		
		return total_a_pagar;
		
	}
	
}
