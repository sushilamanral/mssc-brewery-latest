package sushilamanral.msscbrewerylatest.web.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
	
	@NotBlank	
	private String beerName;
	
	@NotBlank
	private String beerStyle;
	
	@Null
	private UUID id;
	
	@Positive
	private Long upc;
	

}
