package com.tav.av2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tav.av2.model.Procedimento;

public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {
	
	@Query(value= "SELECT p FROM Procedimento p WHERE p.nome_procedimento = :procedimento")
	Procedimento findByName(String procedimento);
	
}
