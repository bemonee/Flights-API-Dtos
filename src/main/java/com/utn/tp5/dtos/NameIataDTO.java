package com.utn.tp5.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
abstract public class NameIataDTO {
	
	private String iata;
	
	private String name;
	
}
