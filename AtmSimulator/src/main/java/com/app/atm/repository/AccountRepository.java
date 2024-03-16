package com.app.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.atm.dto.AccountDto;
import com.app.atm.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>  {

	
}
