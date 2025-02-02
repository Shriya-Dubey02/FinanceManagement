package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Finance.entity.Budget;
import com.learn.Finance.projection.BudgetProjection;
@CrossOrigin
@RepositoryRestResource(excerptProjection = BudgetProjection.class)

public interface BudgetRepository extends JpaRepository<Budget, Integer> {

}
