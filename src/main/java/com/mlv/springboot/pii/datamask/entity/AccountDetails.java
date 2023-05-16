package com.mlv.springboot.pii.datamask.entity;

import com.mlv.springboot.pii.datamask.encrypt.MaskData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetails {

	private String accountHolderName;
	
	@MaskData
	private Long accountNumber;
	private String accountType;

}
