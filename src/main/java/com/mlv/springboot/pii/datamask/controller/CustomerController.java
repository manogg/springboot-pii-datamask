package com.mlv.springboot.pii.datamask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mlv.springboot.pii.datamask.entity.CustomerDetails;
import com.mlv.springboot.pii.datamask.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer")
	public List<CustomerDetails> getAllCustomers() {

		return customerService.getAllCustomer();

	}

	@GetMapping("/customer/{name}")
	public CustomerDetails getCustomerById(@PathVariable("name") String name) {

		return customerService.getCustomerById(name);
	}

	@GetMapping("/customer/mobile")
	public List<String> getAllCustomersMobileNumber() {

		return customerService.getAllMobileNumbers();

	}

}
