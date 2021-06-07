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
@Table(name = "ItensCarrinho")
public class ItensCarrinho  implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToOne
	@JoinColumn(name="id_carrinho",nullable = true)
	Carrinho carrinho;
	
	@OneToOne
	@JoinColumn(name="id_produtos",nullable = true)
	Produtos produtos;
	
	@Column(name="quantidade")
	int quantidade;
	
	@Column(name="preco")
	double preco;
	
	@Column(name="nome_produto")
	String nomeProduto;

	public ItensCarrinho(int id, Carrinho carrinho, Produtos produtos, int quantidade, double preco,
			String nomeProduto) {
		super();
		this.id = id;
		this.carrinho = carrinho;
		this.produtos = produtos;
		this.quantidade = quantidade;
		this.preco = preco;
		this.nomeProduto = nomeProduto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
