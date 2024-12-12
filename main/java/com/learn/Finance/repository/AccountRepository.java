package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Finance.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
