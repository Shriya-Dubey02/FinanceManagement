package com.learn.Finance.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String userId;
	@NotNull
	@NotBlank(message= "username cannot be blank")
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	@NotNull
	@NotBlank
	@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$")
	private String password;
	@Column(nullable = false, unique = true)
	@Pattern(regexp = "^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	private String email;
	@Column(nullable = false)
	@NotNull
	@NotBlank(message ="first name cannot be blank")
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	List<Income> incomes;
	

}
