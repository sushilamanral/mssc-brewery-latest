package sushilamanral.msscbrewerylatest.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sushilamanral.msscbrewerylatest.services.CustomerService;
import sushilamanral.msscbrewerylatest.web.model.CustomerDto;

@RestController
@RequestMapping("api/v1/customer/")
public class CustomerController {
	
	CustomerService customerService;
	
	public  CustomerController(CustomerService customerService) {
		// TODO Auto-generated constructor stub
		this.customerService = customerService;
	}
	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){
		
		return new ResponseEntity<CustomerDto>(customerService.getCustomer(customerId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity handlePost(@Valid @RequestBody CustomerDto customerDto) {
		CustomerDto savedDto = customerService.savedNewCustomer(customerDto);
		HttpHeaders header = new HttpHeaders();
		header.add("location", savedDto.getId().toString());
		return new ResponseEntity(savedDto, header, HttpStatus.CREATED);
	}

	
	
}
