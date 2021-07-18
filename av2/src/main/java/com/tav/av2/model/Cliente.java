package com.tav.av2.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Cliente")
public class Cliente extends Usuario {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	String nome;

	@Column(name = "cpf")
	String cpf;

	@Column(name = "plano_saude")
	Boolean plano_saude;

	@Column(name = "nome_plano_saude")
	String nome_plano_saude;

	// tem plano ou não
	@Column(name = "tipo_plano_saude")
	String tipo_plano_saude;

	@Column(name = "numero_prontuario")
	int numero_prontuario;

	@Column(name = "data_nascimento")
	Date data_nascimento;

	// Sim ou não
	@Column(name = "dependente")
	Boolean dependente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Boolean getPlano_saude() {
		return plano_saude;
	}

	public void setPlano_saude(Boolean plano_saude) {
		this.plano_saude = plano_saude;
	}

	public String getNome_plano_saude() {
		return nome_plano_saude;
	}

	public void setNome_plano_saude(String nome_plano_saude) {
		this.nome_plano_saude = nome_plano_saude;
	}

	public String getTipo_plano_saude() {
		return tipo_plano_saude;
	}

	public void setTipo_plano_saude(String tipo_plano_saude) {
		this.tipo_plano_saude = tipo_plano_saude;
	}

	public int getNumero_prontuario() {
		return numero_prontuario;
	}

	public void setNumero_prontuario(int numero_prontuario) {
		this.numero_prontuario = numero_prontuario;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Boolean getDependente() {
		return dependente;
	}

	public void setDependente(Boolean dependente) {
		this.dependente = dependente;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
