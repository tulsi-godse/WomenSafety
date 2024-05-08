package com.WomenSafety.WomenSafetyApplication.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(name = "name")
	@NotBlank(message = "Name field should not be null")
	private String name;
	private int number;
	@Email
	private String email;
	@NotBlank(message = "address field should not be null")
	private String address;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "aid")
//	@JsonIgnoreProperties("admin")
//	private Admin admin;
}
