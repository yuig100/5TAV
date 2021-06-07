package com.tav.bazar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produtos")
public class Produtos  implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="nome")
	String nome;
	
	@Column(name="quantidade")
	int quantidade;
	
	@Column(name="preco")
	double preco;
	
	@Column(name="fornecedor")
	String fornecedor;

	public Produtos(int id, String nome, int quantidade, double preco, String fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.fornecedor = fornecedor;
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

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

}
