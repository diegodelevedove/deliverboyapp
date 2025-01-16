package com.deliverboy.deliverboy.domain.entities;

import java.util.Date;
import java.util.Objects;

public class Moto {
	
	private Long id;
	private String placa;
	private String modelo;
	private String cor;
	private Date ano;
	private String documento;
	private String fotoCaminhoImagem;
	
	private Motoboy motoboy;

	public Moto(String placa, String modelo, String cor, Date ano, String documento, String fotoCaminhoImagem,
			Motoboy motoboy) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.documento = documento;
		this.fotoCaminhoImagem = fotoCaminhoImagem;
		this.motoboy = motoboy;
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
