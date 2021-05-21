package com.tav.bazar.model;

public class Pedidos {
	
	int id;
	int idCliente;
	double valorTotal;
	int idEntrega;
	
	public Pedidos(int id, int idCliente, double valorTotal, int idEntrega) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.valorTotal = valorTotal;
		this.idEntrega = idEntrega;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}
	
	
	
}
