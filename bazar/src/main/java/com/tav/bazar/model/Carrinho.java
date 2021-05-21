package com.tav.bazar.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Carrinho {
	
	int id;
	Date dataCompra;
	double valorTotal;
	double frete;
	
	List<Produtos> fgh;
	
	public Carrinho(int id, Date dataCompra, double valorTotal, double frete) {
		super();
		this.id = id;
		this.dataCompra = dataCompra;
		this.valorTotal = valorTotal;
		this.frete = frete;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDataCompra() {
		return dataCompra;
	}
	
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public double getFrete() {
		return frete;
	}
	
	public void setFrete(double frete) {
		this.frete = frete;
	}

	public List<Produtos> getFgh() {
		return fgh;
	}

	public void setFgh(List<Produtos> fgh) {
		this.fgh = fgh;
	}
	
	public void inserir_carrinho(Produtos produto) {
		
		List<Produtos> list = new LinkedList<Produtos>();
		list.add(produto);
		
		this.fgh = list;
		
		if(this.valorTotal == 0) {
			
			this.setValorTotal(produto.preco);
			
		} else {
			
			this.setValorTotal(this.valorTotal + produto.preco);
			
		}
		
	}
	
}
