package com.WomenSafety.WomenSafetyApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WomenSafety.WomenSafetyApplication.Entity.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer>{

}
