package com.deliverboy.deliverboy.domain;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class EntregaEndereco implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;	
	private String coordenadas;	
	private String endereco;
	
	
	public EntregaEndereco(long id, String coordenadas, String endereco) {
		super();
		this.id = id;
		this.coordenadas = coordenadas;
		this.endereco = endereco;
	}


	public String getCoordenadas() {
		return coordenadas;
	}


	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public long getId() {
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
		EntregaEndereco other = (EntregaEndereco) obj;
		return id == other.id;
	}
	
	
	
	
	

	
	
	
	
	
	
}
