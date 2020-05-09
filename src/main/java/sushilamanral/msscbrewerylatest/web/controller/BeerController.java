package sushilamanral.msscbrewerylatest.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.var;
import sushilamanral.msscbrewerylatest.services.BeerService;
import sushilamanral.msscbrewerylatest.web.model.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
@RequiredArgsConstructor
public class BeerController {
	private final BeerService beerService;
	
	
	@GetMapping (value={"/{beerId}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
	
		val headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf-8");
		return new ResponseEntity<>(beerService.getBeerById(beerId), headers, HttpStatus.OK);
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity handlePost(@Valid @RequestBody BeerDto beerDto) { 
		val savedbeer = beerService.saveBeerDto(beerDto);
		val headers = new HttpHeaders();
		headers.add( "Location",  savedbeer.getId().toString());
		return new ResponseEntity(headers,HttpStatus.CREATED);
	}
	@PutMapping (value = {"/{beerId}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity handlePut( @PathVariable("beerId") UUID uuid, @Valid @RequestBody BeerDto beerDto) { 
		beerService.updateBeer(uuid, beerDto);
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping ({"/{beerId}"})
	public void handleDelete(@PathVariable("beerId") UUID uuid) { 
		beerService.deleteBeer(uuid);
	}
	
	
	

}	
