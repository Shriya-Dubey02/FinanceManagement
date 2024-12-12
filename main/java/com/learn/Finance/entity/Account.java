package com.learn.Finance.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	@Id
	private String accountId;
	
	private String accountType;
	
	private int initialBalance;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "account")
	private List<Income> incomes;
	
	

}
