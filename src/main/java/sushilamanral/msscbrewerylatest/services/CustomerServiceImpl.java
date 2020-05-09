package sushilamanral.msscbrewerylatest.services;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import sushilamanral.msscbrewerylatest.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService  {

	@Override
	public CustomerDto getCustomer(UUID custId) {
		// TODO Auto-generated method stub
		return  CustomerDto.builder().id(UUID.randomUUID()).name("Cutomer one").build();
	}

	@Override
	public CustomerDto savedNewCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return CustomerDto.builder().id(UUID.randomUUID()).build();
	}

}
