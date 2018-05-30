package com.utn.tp5.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PriceDTO {
	
	private RouteDTO route;
	
	private CabinDTO cabin;
	
	private double price;

	private LocalDate toDate;

	private LocalDate fromDate;
}
