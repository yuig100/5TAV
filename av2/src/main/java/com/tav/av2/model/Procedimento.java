package com.tav.av2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "Procedimento")
public class Procedimento {
	
	@EqualsAndHashCode.Include
	@Id
	String nome_procedimento;

	@Column(name = "valor_procedimento")
	double valor;
	
	@OneToMany(mappedBy = "procedimento")
	//@JoinColumn(name = "id_procedimento")
	List<Orcamento> orcamento;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Orcamento> getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(List<Orcamento> orcamento) {
		this.orcamento = orcamento;
	}

	public String getNome_procedimento() {
		return nome_procedimento;
	}

	public void setNome_procedimento(String nome_procedimento) {
		this.nome_procedimento = nome_procedimento;
	}

}
