package com.tav.bazar.model;

public class Frete {
	
	int id;
	int id_Pedidos;
	double preco;
	
	public Frete(int id, int id_Pedidos, double preco) {
		super();
		this.id = id;
		this.id_Pedidos = id_Pedidos;
		this.preco = preco;
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
	public double getFrete() {
		return preco;
	}
	public void setFrete(double preco) {
		this.preco = preco;
	}
	
	public double calcular_frete(double distancia) {
				
		return distancia * this.preco;
	}
	
}
