package com.tav.bazar.model;

public class Enderecos {
	
	int id_Cliente;
	int id_Entrega;
	int id_Pedidos;
	String endereco;
	
	public Enderecos(int id_Cliente, int id_Entrega,int id_Pedidos ,String endereco) {
		super();
		this.id_Cliente = id_Cliente;
		this.id_Entrega = id_Entrega;
		this.id_Pedidos = id_Pedidos;
		this.endereco = endereco;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public int getId_Entrega() {
		return id_Entrega;
	}

	public void setId_Entrega(int id_Entrega) {
		this.id_Entrega = id_Entrega;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId_Pedidos() {
		return id_Pedidos;
	}

	public void setId_Pedidos(int id_Pedidos) {
		this.id_Pedidos = id_Pedidos;
	}
	
	
	
}
