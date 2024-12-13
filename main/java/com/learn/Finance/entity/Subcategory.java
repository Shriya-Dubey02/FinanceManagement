package com.learn.Finance.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Subcategory {
	@Id
	private String id;
	@Column(nullable = false)
	private String subCategoryName;
	
	@ManyToOne
	private Category category;
	
//	@ManyToMany
//	private List<Expense> expense;

}
