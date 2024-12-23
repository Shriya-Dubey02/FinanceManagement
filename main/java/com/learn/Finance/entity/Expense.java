package com.learn.Finance.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String expenseId;
	@ManyToOne
	private Account account;
	
	@ManyToOne
	private Subcategory subcategory;
	@ManyToOne
	private User user;
	
	private int amount;
	
	

}
