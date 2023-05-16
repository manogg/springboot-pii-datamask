package com.mlv.springboot.pii.datamask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDetails {

	private String bankName;
	private String bankBranch;
	private String bankIFSC;

}
