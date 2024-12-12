package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Finance.entity.Category;
// Category repository
public interface CategoryRepository extends JpaRepository<Category, String>{

}
