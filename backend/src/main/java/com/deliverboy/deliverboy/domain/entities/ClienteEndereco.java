package com.deliverboy.deliverboy.domain.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Table(name="cliente_endereco")
@Entity
public class ClienteEndereco implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	@NotNull
	private String logradouro;
	@NotNull
	private String cep;
	@NotNull
	private String bairro;
	@NotNull
	private String pais;	
	private Integer numeroResidencia;
	
	
	
	public ClienteEndereco(long id,String endereco,String logradouro,String cep,String bairro,String pais) {
		super();
		this.id = id;		
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.pais = pais;
	}

	public long getId() {
		return id;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getNumeroResidencia() {
		return numeroResidencia;
	}

	public void setNumeroResidencia(Integer numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
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
		ClienteEndereco other = (ClienteEndereco) obj;
		return id == other.id;
	}
	
	
	
	
	

	
	
	
	
	
	
}
