package com.learn.Finance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Budget {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int budgetId;
	@ManyToOne
	private Subcategory subcategory;
	
    private int limitAmount;
    private int spent;
    private int remaining;
    
    @ManyToOne
    private User user;
	
	
	
	

}
