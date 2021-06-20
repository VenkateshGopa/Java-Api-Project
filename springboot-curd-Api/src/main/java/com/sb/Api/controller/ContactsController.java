package com.sb.Api.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sb.Api.model.contacts;
import com.sb.Api.service.ContactsService;

@RestController
public class ContactsController {
	
	@Autowired
	ContactsService service;
	
	// using GetMapping("/contacts") annotation to get all contacts
	@GetMapping("/contacts")
	public List<contacts> getcontacts()
	{
		return service.getallcontacts();
	}
	
	// using GetMapping("/contacts/{number}") annotation to get the contact details of that number
	@GetMapping("/contacts/{number}")
	// pathVariable is used to get inputs from url
	public Optional<contacts> getbynumber(@PathVariable("number") long number)
	{
		return service.getcontactbynumber(number);
	}

	//PostMapping("/contacts/add") is used to add contact to the contact data
	@PostMapping("/contacts/add")
	public String addcontact(@RequestBody contacts contact)
	{
		//Using RequestBody to get the input contact details from the request.
		try {
			service.addorupdatecontact(contact);
			return "Contact added Succusfully";
		}catch(Exception e){
			return "Contact adding failed please retry";
		}	
	}

	//PutMapping("/contacts/update") is used to update contact in the contact data
	@PutMapping("/contacts/update")
	public String  updatecontact(@RequestBody contacts contact)
	{
		//Using RequestBody to get the input contact details from the request.
		try {
			service.addorupdatecontact(contact);
			return "Contact Updated  Succusfully";
		}catch(Exception e){
			return "Contact Updating failed please retry";
		}	
	}
	
	//DeleteMapping("/contacts/delete/{number}") is used to delete contact  in the contact data
	@DeleteMapping("/contacts/delete/{number}")
	public String  deletecontact(@PathVariable("number") long number)
	{
		// pathVariable is used to get inputs from url
		try {
			service.deletecontact(number);
			return "Contact deleted  Succusfully";
		}catch(Exception e){
			return "Contact deleting failed please retry";
		}
	}
}
