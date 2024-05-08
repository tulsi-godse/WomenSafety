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

import com.WomenSafety.WomenSafetyApplication.Entity.EmergencyContacts;
import com.WomenSafety.WomenSafetyApplication.Service.EmergencyContactsService;

@RestController
public class EmergencyContactsController {
	
	@Autowired
	EmergencyContactsService emergencyContactsService;
	
	@PostMapping("/emergencyContacts")
	public EmergencyContacts saveEmergencyContacts(@RequestBody EmergencyContacts emergencyContacts) {
		return emergencyContactsService.createEmergencyContacts(emergencyContacts);
	}
	
	@GetMapping("/emergencyContacts/{id}")
	public EmergencyContacts getEmergencyContactsById(@PathVariable("id")int id) {	
		return emergencyContactsService.getEmergencyContactsById(id);
	}
	
	@DeleteMapping("/emergencyContacts/delete/{id}")
	public void deleteEmergencyContacts(@PathVariable int id) {
		emergencyContactsService.deleteEmergencyContacts(id);
		System.out.println("Data Deleted");
	}
	
	@PutMapping("/emergencyContacts/update/{id}")
		public EmergencyContacts updateEmergencyContacts(@PathVariable("id") int id, @RequestBody EmergencyContacts emergencyContacts) {
			emergencyContacts.setEid(id);
			EmergencyContacts updateEmergencyContacts = emergencyContactsService.updateEmergencyContacts(emergencyContacts);
			return updateEmergencyContacts;
		}
	@GetMapping("/emergencyContacts/getAllData")
	public List<EmergencyContacts> getAllEmergencyContacts(){
	List<EmergencyContacts> emergencyContacts= emergencyContactsService.getAllEmergencyContacts();
	     return emergencyContacts;
	}

}
