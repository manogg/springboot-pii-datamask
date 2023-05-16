package com.mlv.springboot.pii.datamask.entity;

import java.util.List;

import com.mlv.springboot.pii.datamask.encrypt.MaskData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDetails {

	private String name;
	private String email;

	@MaskData
	private String mobileNumber;

	@MaskData
	private String AdharNumber;
	private List<AccountDetails> accountDetails;
	private List<BankDetails> bankDetails;

}
