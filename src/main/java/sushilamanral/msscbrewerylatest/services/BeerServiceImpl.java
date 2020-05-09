package sushilamanral.msscbrewerylatest.services;

import java.util.UUID;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import sushilamanral.msscbrewerylatest.web.model.BeerDto;
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerID) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Noida Beer").beerStyle("Weekend").build();
	}

	@Override
	public BeerDto saveBeerDto(BeerDto beerDto) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void deleteBeer(UUID uuid) {
		// TODO Auto-generated method stub
		log.debug("deleting beer....");
	}

	@Override
	public void updateBeer(UUID uuid, BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}

}
