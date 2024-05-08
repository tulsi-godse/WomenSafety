/*package com.WomenSafety.WomenSafetyApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WomenSafety.WomenSafetyApplication.Entity.Login;
import com.WomenSafety.WomenSafetyApplication.Service.LoginSrevice;

import jakarta.persistence.GeneratedValue;

@RestController
public class LoginController {
	
	@Autowired
	LoginSrevice loginSrevice;
	
	@PostMapping("/login")
	public Login saveLogin(@RequestBody Login login) {
		return loginSrevice.createLogin(login);
	}
	
	@GetMapping("/login/{id}")
	public Login getLoginById(@PathVariable("id")int id) {
		return loginSrevice.getLoginById(id);
	}
	
	@DeleteMapping("/login/")

}*/
