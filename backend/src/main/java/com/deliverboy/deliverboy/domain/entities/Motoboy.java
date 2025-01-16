package com.deliverboy.deliverboy.domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Table(name="motoboy")
@Entity
public class Motoboy implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	
	private String nome;
	private String email;
	private String telefone;
	private Date dataNasc;
	private String cpf;
	private String identidade;
	private Double remuneracao;
	private String numeroConta;
	
	
	public Motoboy(String nome, String email, String telefone, Date dataNasc, String cpf, String identidade,
			Double remuneracao, String numeroConta) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.identidade = identidade;
		this.remuneracao = remuneracao;
		this.numeroConta = numeroConta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getIdentidade() {
		return identidade;
	}


	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}


	public Double getRemuneracao() {
		return remuneracao;
	}


	public void setRemuneracao(Double remuneracao) {
		this.remuneracao = remuneracao;
	}


	public String getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}


	public Long getId() {
		return id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motoboy other = (Motoboy) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
