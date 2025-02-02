package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Finance.entity.Account;
@CrossOrigin	
public interface AccountRepository extends JpaRepository<Account, String> {

}
