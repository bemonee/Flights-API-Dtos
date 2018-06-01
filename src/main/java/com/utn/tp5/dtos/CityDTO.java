package com.utn.tp5.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityDTO extends NameIataDTO {
	
	private StateDTO state;
	
	public CityDTO(String iata, String name, StateDTO state) {
		super(iata, name);
		this.state = state;
	}

	public CityDTO() {
		super();
	}
}
