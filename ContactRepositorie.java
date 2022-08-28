package com.syrine.komutel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syrine.komutel.models.Contact;


public interface ContactRepositorie extends  JpaRepository<Contact, Long>  {
	

}
