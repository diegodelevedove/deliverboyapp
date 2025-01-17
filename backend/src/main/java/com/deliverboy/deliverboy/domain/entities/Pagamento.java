package com.deliverboy.deliverboy.domain.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.deliverboy.deliverboy.domain.enums.PagamentoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="pagamento")
@Entity
public class Pagamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Cliente cliente;
	private Entrega entrega;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy/MM/dd'T'HH:mm:ss'Z'",timezone = "GMT")
	private Instant dataPagamento;
	private Double pagamentoMotoboy;
	private Double pagamentoEmpresa;
	private PagamentoEnum statusPagamento;
	
	
	public Pagamento(Cliente cliente, Entrega entrega,Instant dataPagamento,Double pagamentoMotoboy, Double pagamentoEmpresa) {
		super();
		this.cliente = cliente;
		this.entrega = entrega;
		this.pagamentoMotoboy = pagamentoMotoboy;
		this.pagamentoEmpresa = pagamentoEmpresa;
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


	public Instant getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(Instant dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	public Double getPagamentoMotoboy() {
		return pagamentoMotoboy;
	}


	public void setPagamentoMotoboy(Double pagamentoMotoboy) {
		this.pagamentoMotoboy = pagamentoMotoboy;
	}


	public Double getPagamentoEmpresa() {
		return pagamentoEmpresa;
	}


	public void setPagamentoEmpresa(Double pagamentoEmpresa) {
		this.pagamentoEmpresa = pagamentoEmpresa;
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
