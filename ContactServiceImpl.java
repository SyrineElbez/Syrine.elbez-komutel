package com.syrine.komutel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syrine.komutel.dto.ContactRequest;
import com.syrine.komutel.models.Contact;
import com.syrine.komutel.repositories.ContactRepositorie;


@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepositorie contactRepositorie;

	@Override
	public Contact saveContact(ContactRequest contactRequest) {
		Contact contact=new Contact (contactRequest.getNom(),contactRequest.getVille(),contactRequest.getAdresse()
				,contactRequest.getPays(),contactRequest.getTelephone(),contactRequest.getPoste(),contactRequest.getDate());
		return contactRepositorie.save(contact);
	}

	@Override
	public List<Contact> getListAllContact() {
		return contactRepositorie.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Contact getContactById(Long id) {
		
		return contactRepositorie.getById(id);
	}

	@Override
	public Contact updateContact(Long id_old, ContactRequest contactRequest) {
		@SuppressWarnings("deprecation")
		Contact oldContact=contactRepositorie.getById(id_old);
		
		oldContact.setNom(contactRequest.getNom());
		oldContact.setAdresse(contactRequest.getAdresse());
		oldContact.setVille(contactRequest.getVille());
		oldContact.setPays(contactRequest.getPays());
		oldContact.setTelephone(contactRequest.getTelephone());
		oldContact.setPoste(contactRequest.getPoste());
		oldContact.setDate(contactRequest.getDate());
		
		Contact newContact=contactRepositorie.save(oldContact);
		
		return newContact ;
	}

	@Override
	public Boolean deleteContactById(Long id) {
		
		Contact existingContact=contactRepositorie.getById(id);
		if(existingContact != null) {
			contactRepositorie.deleteById(id);
			return true;
		}
		return false;
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	

}
