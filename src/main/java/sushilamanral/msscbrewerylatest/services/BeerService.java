package sushilamanral.msscbrewerylatest.services;

import java.util.UUID;

import sushilamanral.msscbrewerylatest.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerID);

	BeerDto saveBeerDto(BeerDto beerDto);
	
	void updateBeer(UUID uuid, BeerDto beerDto);
	void deleteBeer(UUID uuid);
}
