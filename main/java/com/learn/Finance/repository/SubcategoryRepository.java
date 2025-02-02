package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Finance.entity.Subcategory;
@CrossOrigin
public interface SubcategoryRepository extends JpaRepository<Subcategory, String> {

}
