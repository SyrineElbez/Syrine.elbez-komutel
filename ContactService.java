package com.syrine.komutel.services;

import java.util.List;

import com.syrine.komutel.dto.ContactRequest;
import com.syrine.komutel.models.Contact;



public interface ContactService {
	public Contact saveContact(ContactRequest contact);
	public List<Contact>getListAllContact();
	public Contact getContactById(Long id);
	public Contact updateContact (Long id_old,ContactRequest contact);
	public Boolean   deleteContactById(Long id);

}


