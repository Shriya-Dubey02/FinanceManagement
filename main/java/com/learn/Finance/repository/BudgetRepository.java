package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Finance.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {

}
