package com.WomenSafety.WomenSafetyApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class WebinarsOnSafety {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wid;
	
	private String Topic;
	private int startdate;
	private int enddate;
	private String Location;

}
