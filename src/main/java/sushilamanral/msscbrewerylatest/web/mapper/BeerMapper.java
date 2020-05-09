package sushilamanral.msscbrewerylatest.web.mapper;

import org.mapstruct.Mapper;

import sushilamanral.msscbrewerylatest.domain.Beer;
import sushilamanral.msscbrewerylatest.web.model.BeerDto;

@Mapper
public interface BeerMapper {
	
	BeerDto beerToBeerDto(Beer beer);
	Beer beerDtoToBeer(BeerDto beerDto);

}
