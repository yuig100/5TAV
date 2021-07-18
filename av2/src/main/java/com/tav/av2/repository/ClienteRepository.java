package com.tav.av2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tav.av2.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query(value= "SELECT c FROM Cliente c WHERE c.cpf = ?1")
	List<Cliente> findByCpf(String cpf);
	
	@Modifying
	@Query("DELETE FROM Cliente c WHERE c.cpf=:cpf")
	Optional<Cliente> deleteByCpf(@Param("cpf") String cpf);

}
