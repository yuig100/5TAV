package com.tav.av2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tav.av2.model.Pedido_Aprovacao;

@Repository
public interface Pedido_AprovacaoRepository extends JpaRepository<Pedido_Aprovacao, Long> {

}
