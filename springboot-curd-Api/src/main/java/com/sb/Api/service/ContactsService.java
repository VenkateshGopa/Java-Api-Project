package com.sb.Api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.Api.model.contacts;
import com.sb.Api.repository.ContactsRepositor;

@Service
public class ContactsService {

	@Autowired
	ContactsRepositor repo;
	
	public List<contacts> getallcontacts() {
		return (List<contacts>) repo.findAll();
	}

	public Optional<contacts> getcontactbynumber(long number) {
		return repo.findById(number);
	}

	public void addorupdatecontact(contacts contact) {
		repo.save(contact);
	}

	public void deletecontact(long number) {
		repo.deleteById(number);
	}

}