package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Finance.entity.Income;
import com.learn.Finance.projection.IncomeProjection;

@CrossOrigin
@RepositoryRestResource(excerptProjection = IncomeProjection.class)
public interface IncomeRepository extends JpaRepository<Income, String> {

}

