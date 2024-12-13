package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Finance.entity.Expense;

public interface ExpenseRespository extends JpaRepository<Expense, String> {

}
