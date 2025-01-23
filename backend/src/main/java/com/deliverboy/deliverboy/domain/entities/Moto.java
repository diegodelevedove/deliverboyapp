package com.deliverboy.deliverboy.domain.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="moto")
public class Moto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String placa;
	private String modelo;
	private String cor;
	private Date ano;
	private String documento;
	private String fotoCaminhoImagem;
	
	@ManyToOne
	@JoinColumn(name="moto_id")
	private List<Motoboy> motoboy = new ArrayList<>();

	public Moto(String placa, String modelo, String cor, Date ano, String documento, String fotoCaminhoImagem
			) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.documento = documento;
		this.fotoCaminhoImagem = fotoCaminhoImagem;
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getFotoCaminhoImagem() {
		return fotoCaminhoImagem;
	}

	public void setFotoCaminhoImagem(String fotoCaminhoImagem) {
		this.fotoCaminhoImagem = fotoCaminhoImagem;
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
		Moto other = (Moto) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
