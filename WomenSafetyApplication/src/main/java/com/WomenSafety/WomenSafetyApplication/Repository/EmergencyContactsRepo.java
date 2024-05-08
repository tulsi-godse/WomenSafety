package com.WomenSafety.WomenSafetyApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WomenSafety.WomenSafetyApplication.Entity.EmergencyContacts;

@Repository
public interface EmergencyContactsRepo extends JpaRepository<EmergencyContacts, Integer>{

}
