package com.banking.accounts.mapper;

import com.banking.accounts.dto.CustomerDto;
import com.banking.accounts.entity.Customer;

public class CustomerMapper {

	public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
		customerDto.setEmail(customer.getEmail());
		customerDto.setMobileNumber(customer.getMobileNumber());
		customerDto.setName(customer.getCustomerName());
		return customerDto;
	}
	
	public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
		customer.setEmail(customerDto.getEmail());
		customer.setMobileNumber(customerDto.getMobileNumber());
		customer.setCustomerName(customerDto.getName());
		return customer;
	}
}
