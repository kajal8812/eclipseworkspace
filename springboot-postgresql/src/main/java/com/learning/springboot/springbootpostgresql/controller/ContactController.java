package com.learning.springboot.springbootpostgresql.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.springboot.springbootpostgresql.repository.ContactRepository;

@RestController
public class ContactController {

	@Autowired
	ContactRepository cr;

	@PostMapping("/")
	public ResponseEntity<Contact> saveContact(@RequestBody Contact contact) {
		return ResponseEntity.ok(ContactRepository.save(contact));
	}

	@GetMapping("/")
	public ResponseEntity<List<Contact>> getAllContacts(){
	{
		return ResponseEntity.ok(ContactRepository.findAll());
	}
}
