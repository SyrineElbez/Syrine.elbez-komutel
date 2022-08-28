package com.syrine.komutel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.syrine.komutel.dto.ContactRequest;
import com.syrine.komutel.models.Contact;
import com.syrine.komutel.services.ContactService;


@RestController
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@PutMapping("/contact")
	public Contact saveContact(@RequestBody ContactRequest e) {
		return contactService.saveContact(e);
	}

	@GetMapping("/contact")
	public List<Contact>getListAllContact(){
		return contactService.getListAllContact();
		}
		
	@GetMapping("/contact/{id}")
		public Contact getContactById(@PathVariable(name="id")Long id) {
		return contactService.getContactById(id);
		
	}
	
	@PutMapping("/contact/{id}")
	public Contact updateContact(@PathVariable(name="id")Long id_old,@RequestBody ContactRequest contact) {
		return contactService.updateContact(id_old, contact);
		}
	
	@DeleteMapping("contact/{id}")
	public boolean deleteContactById(@PathVariable(name="id")Long id) {
		return contactService.deleteContactById((long)id);
		
	}        
	
}
	
	
	
	
	
	
	
			
		
		
		
	
	

