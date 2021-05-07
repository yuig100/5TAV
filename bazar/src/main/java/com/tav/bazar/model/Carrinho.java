package com.tav.bazar.model;

import java.sql.Date;

public class Carrinho {
	
	int id;
	Date dataCompra;
	double valorTotal;
	double frete;
	
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
	
	
	
}
