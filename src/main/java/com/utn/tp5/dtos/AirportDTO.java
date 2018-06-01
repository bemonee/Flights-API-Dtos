package com.utn.tp5.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirportDTO extends NameIataDTO {

	private CityDTO city;

	public AirportDTO(String iata, String name, CityDTO city) {
		super(iata, name);
		this.city = city;
	}

	public AirportDTO() {
		super();
	}

}
