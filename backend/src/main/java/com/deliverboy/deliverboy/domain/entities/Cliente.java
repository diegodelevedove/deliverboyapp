package com.deliverboy.deliverboy.domain.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	private Integer telefone;
	@NotNull
	private String cpfOuCnpj;
	@NotNull
	private long numCartaoCredito;
	
	@JsonIgnore
	@OneToOne
	@MapsId("cliente_endereco_id")
	private ClienteEndereco clienteEndereco;	
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	List<Entrega> entrega = new ArrayList<>();
	
	public Cliente(){}
	
	public Cliente(String nome, Integer telefone,String cpfOuCnpj,long numCartaoCredito){
		super();		
		this.nome = nome;
		this.telefone = telefone;
		this.cpfOuCnpj = cpfOuCnpj;		
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
	
	public List<Entrega> getEntrega() {
		return entrega;
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
