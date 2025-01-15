package com.deliverboy.deliverboy.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private Integer telefone;
	private String cpfOuCnpj;	
	private long numCartaoCredito;	
	
	private List<EntregaEndereco> entregaEndereco = new ArrayList<>();
	
	public Cliente(String nome, Integer telefone,String cpfOuCnpj,long numCartaoCredito) {
		super();		
		this.nome = nome;
		this.telefone = telefone;
		this.cpfOuCnpj = (cpfOuCnpj);		
		this.numCartaoCredito = numCartaoCredito;
	}
	
	public long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getTelefone() {
		return telefone;
	}


	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}


	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}


	public long getNumCartaoCredito() {
		return numCartaoCredito;
	}


	public void setNumCartaoCredito(long numCartaoCredito) {
		this.numCartaoCredito = numCartaoCredito;
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
		Cliente other = (Cliente) obj;
		return id == other.id;
	}

	
	
	
	
	
	
	
	
	
}
