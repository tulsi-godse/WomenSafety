package com.WomenSafety.WomenSafetyApplication.Service;

import java.util.List;

import com.WomenSafety.WomenSafetyApplication.Entity.EmergencyContacts;

public interface EmergencyContactsService {
	
	EmergencyContacts createEmergencyContacts(EmergencyContacts emergencyContacts);
	EmergencyContacts getEmergencyContactsById(int id);
	void deleteEmergencyContacts(int id);
	EmergencyContacts updateEmergencyContacts(EmergencyContacts emergencyContacts);
	List<EmergencyContacts> getAllEmergencyContacts();

}
