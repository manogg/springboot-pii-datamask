package com.mlv.springboot.pii.datamask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlv.springboot.pii.datamask.dto.CustomerDTO;
import com.mlv.springboot.pii.datamask.entity.CustomerDetails;

@Service
public class CustomerService {

	@Autowired
	private CustomerDTO customerDTO;

	public List<CustomerDetails> getAllCustomer() {

		return customerDTO.saveCustomer();
	}

	public CustomerDetails getCustomerById(String name) {

		return customerDTO.getCustomerById(name);
	}

	public List<String> getAllMobileNumbers() {

		return customerDTO.getMobileNumber();
	}
}
