package com.tav.bazar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tav.bazar.model.Clientes;

public interface ClientesRepository  extends JpaRepository<Clientes,Long>{

	<ClieMod extends Clientes>ClieMod save(ClieMod entity);
	
	void delete(Clientes clientes);
	
	Clientes findById(int id);
	
	List<Clientes> findAll();
	
}
