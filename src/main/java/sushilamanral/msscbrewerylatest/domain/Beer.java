package sushilamanral.msscbrewerylatest.domain;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sushilamanral.msscbrewerylatest.web.model.v2.BeerDtoV2;
import sushilamanral.msscbrewerylatest.web.model.v2.BeerStyleEnum;
import sushilamanral.msscbrewerylatest.web.model.v2.BeerDtoV2.BeerDtoV2Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Beer {

	private UUID id;
	private String beerName;
	private BeerStyleEnum beerStyle;
	private Long upc;
}
