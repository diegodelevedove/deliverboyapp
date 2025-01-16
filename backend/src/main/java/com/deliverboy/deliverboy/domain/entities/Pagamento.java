package com.deliverboy.deliverboy.domain.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="pagamento")
@Entity
public class Pagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Cliente cliente;
	private Entrega entrega;
	private Double valorMotoboy;
	private Double valorEmpresa;
	
	
	public Pagamento(Cliente cliente, Entrega entrega, Double valorMotoboy, Double valorEmpresa) {
		super();
		this.cliente = cliente;
		this.entrega = entrega;
		this.valorMotoboy = valorMotoboy;
		this.valorEmpresa = valorEmpresa;
	}


	public Long getId() {
		return id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Entrega getEntrega() {
		return entrega;
	}


	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}


	public Double getValorMotoboy() {
		return valorMotoboy;
	}


	public void setValorMotoboy(Double valorMotoboy) {
		this.valorMotoboy = valorMotoboy;
	}


	public Double getValorEmpresa() {
		return valorEmpresa;
	}


	public void setValorEmpresa(Double valorEmpresa) {
		this.valorEmpresa = valorEmpresa;
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
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}



	
	
	
	
	
	
}
