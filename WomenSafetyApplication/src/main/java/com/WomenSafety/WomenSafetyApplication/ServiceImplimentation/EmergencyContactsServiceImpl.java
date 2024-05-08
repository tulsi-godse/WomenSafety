package com.WomenSafety.WomenSafetyApplication.ServiceImplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WomenSafety.WomenSafetyApplication.Entity.EmergencyContacts;
import com.WomenSafety.WomenSafetyApplication.Repository.EmergencyContactsRepo;
import com.WomenSafety.WomenSafetyApplication.Service.EmergencyContactsService;

@Service
public class EmergencyContactsServiceImpl implements EmergencyContactsService{
	
	@Autowired
	EmergencyContactsRepo emergencyContactsRepo;

	@Override
	public EmergencyContacts createEmergencyContacts(EmergencyContacts emergencyContacts) {
		EmergencyContacts em = emergencyContactsRepo.save(emergencyContacts);
		return em;
	}

	@Override
	public EmergencyContacts getEmergencyContactsById(int id) {
		Optional<EmergencyContacts> em = emergencyContactsRepo.findById(id);
		if(em.isPresent()) {
			return em.get();
			}
		return null;
	}

	@Override
	public void deleteEmergencyContacts(int id) {
		emergencyContactsRepo.deleteById(id);
	}

	@Override
	public EmergencyContacts updateEmergencyContacts(EmergencyContacts emergencyContacts) {
		
		EmergencyContacts existingEmergencyContacts = emergencyContactsRepo.findById(emergencyContacts.getEid()).get();
		existingEmergencyContacts.setFirstContactNum(emergencyContacts.getFirstContactNum());
		existingEmergencyContacts.setSecondContactNum(emergencyContacts.getSecondContactNum());
		EmergencyContacts updateEmergencyContacts = emergencyContactsRepo.save(existingEmergencyContacts);
		return updateEmergencyContacts ;
	}

	@Override
	public List<EmergencyContacts> getAllEmergencyContacts() {
		
		return emergencyContactsRepo.findAll();
	}
}
