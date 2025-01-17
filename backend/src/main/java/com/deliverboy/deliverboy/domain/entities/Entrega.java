package com.deliverboy.deliverboy.domain.entities;

import java.io.Serializable;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Table(name="entrega")
@Entity
public class Entrega implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Double valor;
	
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy/MM/dd'T'HH:mm:ss'Z'",timezone = "GMT")
	private Instant dataEntrega;
	
	@NotNull
	private String motoboy;
	@NotNull
	private Double tamanho;
	@NotNull	
	private Double peso;
	@NotNull
	private Boolean status;
	
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	private EntregaEndereco enderecoEntrega;
	
	
	public Entrega(Double valor, Instant dataEntrega, String motoboy, Double tamanho, Double peso,
			Boolean status) {
		super();
		this.valor = valor;
		this.dataEntrega = dataEntrega;
		this.motoboy = motoboy;
		this.tamanho = tamanho;
		this.peso = peso;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Instant getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Instant dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getMotoboy() {
		return motoboy;
	}

	public void setMotoboy(String motoboy) {
		this.motoboy = motoboy;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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
		Entrega other = (Entrega) obj;
		return Objects.equals(id, other.id);
	}


	
	
	
	
}
