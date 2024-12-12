package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Finance.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, String> {

}
