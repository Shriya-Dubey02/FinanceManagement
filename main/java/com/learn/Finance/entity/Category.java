package com.learn.Finance.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	
	@Id
	private String categordId;
	
	@Column(nullable = false)
	private String categoryName;
	
	@Column(nullable= false)
	private String categoryDescription;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
	private List<Subcategory> subcategory;

}
