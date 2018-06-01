package com.utn.tp5.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateDTO extends NameIataDTO {

	private CountryDTO country;

	public StateDTO(String iata, String name, CountryDTO country) {
		super(iata, name);
		this.country = country;
	}

	public StateDTO() {
		super();
	}

}
