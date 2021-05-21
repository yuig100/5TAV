package com.tav.bazar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tav.bazar.model.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos,Integer>{
	
	<PedidMod extends Pedidos>PedidMod save(PedidMod entity);
	
	void delete(Pedidos pedidos);
	
	Pedidos findById(int id);
	
	List<Pedidos> findAll();
	
}
