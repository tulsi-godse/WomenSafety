package com.WomenSafety.WomenSafetyApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WomenSafety.WomenSafetyApplication.Entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
