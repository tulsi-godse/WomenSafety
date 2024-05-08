package com.WomenSafety.WomenSafetyApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WomenSafety.WomenSafetyApplication.Entity.WebinarsOnSafety;

@Repository
public interface WebinarsOnSafetyRepo extends JpaRepository<WebinarsOnSafety, Integer>{
	

}
