package com.tav.bazar.model;

public class ItensPedidos {
	
	int id;
	int idProduto;
	int quantidade;
	double preco;
	public ItensPedidos(int id, int idProduto, int quantidade, double preco) {
		super();
		this.id = id;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
