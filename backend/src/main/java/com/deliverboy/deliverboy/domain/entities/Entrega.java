package com.deliverboy.deliverboy.domain.entities;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="entrega")
@Entity
public class Entrega implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	
	private Double valor;
	private DateTimeFormatter dataEntrega;
	private String motoboy;
	private Double tamanho;
	private Double peso;
	private Boolean status;
	
	public Entrega(Double valor, DateTimeFormatter dataEntrega, String motoboy, Double tamanho, Double peso,
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

	public DateTimeFormatter getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(DateTimeFormatter dataEntrega) {
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
