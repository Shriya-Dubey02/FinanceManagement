package com.learn.Finance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Income {
	@Id
	private String incomeId;
	@ManyToOne
	private User user;
	@ManyToOne
	private Account account;
	
	private int initialBalance;
	

}
