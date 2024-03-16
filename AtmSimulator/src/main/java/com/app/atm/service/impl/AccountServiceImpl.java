package com.app.atm.service.impl;

import org.springframework.stereotype.Service;

import com.app.atm.dto.AccountDto;
import com.app.atm.entity.Account;
import com.app.atm.mapper.AccountMapper;
import com.app.atm.repository.AccountRepository;
import com.app.atm.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	private AccountRepository accountRepository;
	
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}


	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}
