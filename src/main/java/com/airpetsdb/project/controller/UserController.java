package com.airpetsdb.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airpetsdb.project.model.User;
import com.airpetsdb.project.repository.UserRepository;
import com.airpetsdb.project.service.UserService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository clientRepo;

	// getting all A USER == localhost:8080/users/
	@PostMapping("")
	private User submitUser(@RequestBody User users) {
		return userService.submitMetadata(users);
	}

	// Getting A USER == localhost:8080/users/userid
	@GetMapping("/{userid}")
	private User getUserDetails(@PathVariable("userid") String userId) {
		return userService.displayUserMetaData(userId);
	}

	@GetMapping("")
	public List<User> findAll() {
		return userService.findAll();
	}

	// adding new user
	@PostMapping("/signupClient")
	public User signupClient(@RequestBody User user) {

		return userService.signupClient(user);

	}

//	@RequestMapping(method = RequestMethod.PUT, value = "/updateUser/{id}")
//	public void updateUser(@PathVariable int id, @RequestBody User user) {
//		userService.updateUsers(id, user);
//	}

//
//	@GetMapping("/clients")
//
//	public List<Client> getAllClients() {
//
//		return (List<Client>) clientRepo.findAll();
//	}
//
	@GetMapping("/{emailAddress}/{password}")
	public User getClientById(@PathVariable(value = "emailAddress") String emailAddress,
			@PathVariable(value = "password") String password) {

		return clientRepo.findByemailAddress(emailAddress);
	}

	@GetMapping("/findByEmail/{emailAddress}")
	public User getUserByEmailAddress(@PathVariable("emailAddress") String emailAddress) {
		return clientRepo.findByemailAddress(emailAddress);
	}

//	@GetMapping("/{userName}/{password}")
//	public User getClientByUserName(@PathVariable(value = "userName") String userName, @PathVariable(value = "password") String password) {
//		return clientRepo.findById(id)
//	}
}
