package com.WomenSafety.WomenSafetyApplication.Service;

import java.util.List;

import com.WomenSafety.WomenSafetyApplication.Entity.WebinarsOnSafety;

public interface WebinarsOnSafetyService {
	
	 WebinarsOnSafety createWebinarsOnSafety(WebinarsOnSafety webinarsOnSafety);
	 WebinarsOnSafety getWebinarsOnSafetyById(int id);
	 void deleteWebinarsOnsafety(int id);
	 WebinarsOnSafety updateWebinarsOnSafety(WebinarsOnSafety webinarsOnSafety);
	 List<WebinarsOnSafety> getAllWebinarsOnSafety();

}
