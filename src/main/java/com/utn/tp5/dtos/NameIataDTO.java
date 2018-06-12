package com.utn.tp5.dtos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
abstract public class NameIataDTO {

	protected String iata;

	protected String name;

	public NameIataDTO(String iata, String name) {
		super();
		this.iata = iata;
		this.name = name;
	}

	public NameIataDTO() {
		super();
	}
	
}
