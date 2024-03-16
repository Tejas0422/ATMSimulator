package com.app.atm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="account")
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "account_holder_name")
	private String accountHolderName;
	private double balance;
	public Account(Long id, String accountHolderName, double balance) {
		// TODO Auto-generated constructor stub
	}
	public String getAccountHolderName() {
		// TODO Auto-generated method stub
		return this.accountHolderName;
	}
	public long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
		
}
