package com.WomenSafety.WomenSafetyApplication.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WomenSafety.WomenSafetyApplication.Entity.WebinarsOnSafety;
import com.WomenSafety.WomenSafetyApplication.Service.WebinarsOnSafetyService;

@RestController
public class WebinarsOnSafetyController {
	
	@Autowired
	WebinarsOnSafetyService webinarsOnSafetyService;
	
	@PostMapping("/webinarsOnSafety")
	public WebinarsOnSafety saveWebinarsOnSafety(@RequestBody WebinarsOnSafety webinarsOnSafety) {
		return webinarsOnSafetyService.createWebinarsOnSafety(webinarsOnSafety);
	}
	
	@GetMapping("/webinarsOnSafety/{id}")
	public WebinarsOnSafety getWebinarsOnSafetyById(@PathVariable("id")int id) {
		return webinarsOnSafetyService.getWebinarsOnSafetyById(id);
	}
	
	@DeleteMapping("/webinarsOnSafety/delete/{id}")
	public void deleteWebinarsOnSafety(@PathVariable int id) {
		webinarsOnSafetyService.deleteWebinarsOnsafety(id);
		System.out.println("Data Deleted");
	}
	
	@PutMapping("/webinarsOnSafety/update/{id}")
	public WebinarsOnSafety updateWebinarsOnSafety(@PathVariable("id") int id, @RequestBody WebinarsOnSafety webinarsOnSafety) {
		webinarsOnSafety.setWid(id);
		WebinarsOnSafety updateWebinarsOnSafety= webinarsOnSafetyService.updateWebinarsOnSafety(webinarsOnSafety);
		return updateWebinarsOnSafety;	
	}
	
	@GetMapping("/webinarsOnSafety/getAllData")
	public List<WebinarsOnSafety> getAllWebinarsOnSafety(){
		List<WebinarsOnSafety> webinarsOnSafeties = webinarsOnSafetyService.getAllWebinarsOnSafety();
		return webinarsOnSafeties;
	}
}
