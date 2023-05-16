package com.mlv.springboot.pii.datamask.dto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.mlv.springboot.pii.datamask.entity.AccountDetails;
import com.mlv.springboot.pii.datamask.entity.BankDetails;
import com.mlv.springboot.pii.datamask.entity.CustomerDetails;

@Repository
public class CustomerDTO {

	public static List<CustomerDetails> saveCustomer() {

		CustomerDetails Mano = new CustomerDetails("Mano", "manogg626@gmail.com", "9585794587", "123456789012",
				List.of(new AccountDetails("Manogaran", 6340229336L, "SAVING")),
				List.of(new BankDetails("Indian Bank", "Vadaponparappi", "IDIBV00050")));

		CustomerDetails Rajini = new CustomerDetails("Rajini", "rajini626@gmail.com", "9566612236", "432156789012",
				List.of(new AccountDetails("Manogaran", 6340449336L, "SAVING")),
				List.of(new BankDetails("Indian Bank", "Vadaponparappi", "IDIBV00050")));

		CustomerDetails Murali = new CustomerDetails("Murali", "murali626@gmail.com", "80567241413", "432187659012",
				List.of(new AccountDetails("Manogaran", 6340339336L, "SAVING")),
				List.of(new BankDetails("Indian Bank", "Vadaponparappi", "IDIBV00050")));

		return Stream.of(Mano, Rajini, Murali).collect(Collectors.toList());

	}

	public CustomerDetails getCustomerById(String name) {

		return saveCustomer().stream().filter(cus -> cus.getName().equals(name)).findFirst()
				.orElseThrow(() -> new RuntimeException("Customer not found"));
	}

	public List<String> getMobileNumber() {

		return saveCustomer().stream().map(customer -> customer.getMobileNumber()).collect(Collectors.toList());
	}

}
