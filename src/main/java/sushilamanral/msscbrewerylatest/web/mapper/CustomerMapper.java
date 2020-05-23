package sushilamanral.msscbrewerylatest.web.mapper;

import org.mapstruct.Mapper;

import sushilamanral.msscbrewerylatest.domain.Customer;
import sushilamanral.msscbrewerylatest.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {
	
	CustomerDto customerToCustomerDto(Customer customer);
	Customer customerDtoToCustomer(CustomerDto customerDto);

}
