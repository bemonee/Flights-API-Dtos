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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateDTO other = (StateDTO) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}

}
