package com.tav.bazar.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tav.bazar.Repository.PedidosRepository;
import com.tav.bazar.model.Pedidos;

public class PedidosService {

	@Autowired
	PedidosRepository pedidosrepository;
	
	public Pedidos create_pedidos(int id, int idCliente, double valorTotal, int idEntrega) {
		
		Pedidos Obj = new Pedidos(id,idCliente,valorTotal,idEntrega);
		
		return Obj;
	}
	
}
