package com.app.atm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class AccountDto {

	private Long id;
	private String accountHolderName;
	private double balance;
	public AccountDto(long id, String accountHolderName, double balance) {
		this.id=id;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		
	}

	public Long getId() {
		return this.id;
	}
	
	public String getAccountHolderName() {
		return this.accountHolderName;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
