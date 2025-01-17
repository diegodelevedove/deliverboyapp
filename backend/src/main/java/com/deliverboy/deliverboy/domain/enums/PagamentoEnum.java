package com.deliverboy.deliverboy.domain.enums;

public enum PagamentoEnum {

	Pago(0),
	Pendente(1);
	
	private int code;
	
	
	private PagamentoEnum(int code){
		this.code = code;
	}


	public int getCode() {
		return code;
	}


	public static PagamentoEnum valueOf(int code) {
		for(PagamentoEnum value : PagamentoEnum.values()) {
			if(value.getCode() == code) {
				return value;
			}			
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
	
	
}
