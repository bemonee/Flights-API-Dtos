package com.utn.tp5.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RouteDTO {
	
	private AirportDTO origin;
	
	private AirportDTO destination;
	
}
