package com.utn.tp5.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StateDTO extends NameIataDTO {
	
	private CountryDTO country;
	
}
