package com.tav.bazar.model;

public class Clientes {
	
	int id;
	int id_Pedidos;
	int id_Pagamento;
	int id_Endereco;
	String nome;
	
	public Clientes(int id, int id_Pedidos, int id_Pagamento, int id_Endereco, String nome) {
		super();
		this.id = id;
		this.id_Pedidos = id_Pedidos;
		this.id_Pagamento = id_Pagamento;
		this.id_Endereco = id_Endereco;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_Pedidos() {
		return id_Pedidos;
	}
	public void setId_Pedidos(int id_Pedidos) {
		this.id_Pedidos = id_Pedidos;
	}
	public int getId_Pagamento() {
		return id_Pagamento;
	}
	public void setId_Pagamento(int id_Pagamento) {
		this.id_Pagamento = id_Pagamento;
	}
	public int getId_Endereco() {
		return id_Endereco;
	}
	public void setId_Endereco(int id_Endereco) {
		this.id_Endereco = id_Endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
