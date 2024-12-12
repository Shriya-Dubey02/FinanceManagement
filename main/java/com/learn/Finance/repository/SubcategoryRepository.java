package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Finance.entity.Subcategory;

public interface SubcategoryRepository extends JpaRepository<Subcategory, String> {

}
