package com.WomenSafety.WomenSafetyApplication.ServiceImplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WomenSafety.WomenSafetyApplication.Entity.WebinarsOnSafety;
import com.WomenSafety.WomenSafetyApplication.Repository.WebinarsOnSafetyRepo;
import com.WomenSafety.WomenSafetyApplication.Service.WebinarsOnSafetyService;

@Service
public class WebinarsOnsafetyServiceImpl implements WebinarsOnSafetyService{
	
	@Autowired
	WebinarsOnSafetyRepo webinarsOnSafetyRepo;

	@Override
	public WebinarsOnSafety createWebinarsOnSafety(WebinarsOnSafety webinarsOnSafety) {
		WebinarsOnSafety webs = webinarsOnSafetyRepo.save(webinarsOnSafety);
		return webs;
	}

	@Override
	public WebinarsOnSafety getWebinarsOnSafetyById(int id) {
		Optional<WebinarsOnSafety> webs = webinarsOnSafetyRepo.findById(id);
		if(webs.isPresent()) {
			return webs.get();
			}
		return null;
	}

	@Override
	public void deleteWebinarsOnsafety(int id) {
		webinarsOnSafetyRepo.deleteById(id);
		
	}

	@Override
	public WebinarsOnSafety updateWebinarsOnSafety(WebinarsOnSafety webinarsOnSafety) {
		
		WebinarsOnSafety existingWebinarsOnSafety = webinarsOnSafetyRepo.findById(webinarsOnSafety.getWid()).get();
		existingWebinarsOnSafety.setTopic(webinarsOnSafety.getTopic());
		existingWebinarsOnSafety.setStartdate(webinarsOnSafety.getStartdate());
		existingWebinarsOnSafety.setEnddate(webinarsOnSafety.getEnddate());
		existingWebinarsOnSafety.setLocation(webinarsOnSafety.getLocation());
		WebinarsOnSafety updateWebinarsOnSafety = webinarsOnSafetyRepo.save(existingWebinarsOnSafety);
		
		return updateWebinarsOnSafety;
	}

	@Override
	public List<WebinarsOnSafety> getAllWebinarsOnSafety() {
		
		return webinarsOnSafetyRepo.findAll();
	}
	
}
