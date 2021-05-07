package com.tav.bazar.model;

public class ItensCarrinho {
	
	Carrinho carrinho;
	Produtos produtos;
	
	int idCarrinho;
	int idProduto;
	int quantidade;
	double preco;
	String nomeProduto;
	public ItensCarrinho(Carrinho carrinho, Produtos produtos, int idCarrinho, int idProduto, int quantidade,
			double preco, String nomeProduto) {
		super();
		this.carrinho = carrinho;
		this.produtos = produtos;
		this.idCarrinho = idCarrinho;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.nomeProduto = nomeProduto;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	public Produtos getProdutos() {
		return produtos;
	}
	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	public int getIdCarrinho() {
		return idCarrinho;
	}
	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
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
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	
	
}
