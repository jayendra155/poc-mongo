package com.sample.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Address;
import com.sample.model.User;
import com.sample.repository.AddressRepository;
import com.sample.repository.UserRepository;

@RestController
// @RestControllerEndpoint(id = "test")Ma
@RequestMapping("/test")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@GetMapping
	public HttpEntity<User> saveNewUser(@RequestParam String username) {
		User user = new User();
		user.setAge(10);
		user.setUsername(username);
		Address address = new Address();
		address.setAddress("test1");
		Set<Address> addresses = new HashSet<>();
		Address address2 = new Address();
		address2.setAddress("test2");
		addresses.add(address);
		addresses.add(address2);
		user.setAddresses(addresses);
		this.addressRepository.saveAll(addresses);
		this.userRepository.save(user);
		return ResponseEntity.accepted().body(user);
	}

	// @GetMapping
	// public HttpEntity<User> saveNewUser2() {
	// User user = new User();
	// user.setAge(10);
	// user.setUsername(null);
	// this.userRepository.save(user);
	// return ResponseEntity.accepted().body(user);
	// }
}
