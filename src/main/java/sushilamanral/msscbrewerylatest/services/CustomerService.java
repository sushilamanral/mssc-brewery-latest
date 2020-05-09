package sushilamanral.msscbrewerylatest.services;

import java.util.UUID;

import org.springframework.http.ResponseEntity;

import sushilamanral.msscbrewerylatest.web.model.CustomerDto;

public interface CustomerService {
	
	public CustomerDto getCustomer(UUID custId);
	public CustomerDto savedNewCustomer(CustomerDto customerDto);

}
