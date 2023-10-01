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

import com.airpetsdb.project.model.Admin;
import com.airpetsdb.project.repository.AdminRepository;
import com.airpetsdb.project.service.AdminService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/admins")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private AdminRepository adminRepo;

	// getting all A USER == localhost:8080/admins/
	@PostMapping("")
	private Admin submitAdmin(@RequestBody Admin admins) {
		return adminService.submitMetadata(admins);
	}

	@GetMapping("")
	public List<Admin> findAll() {
		return adminService.findAll();
	}

	// adding new admin
	@PostMapping("/signupClient")
	public Admin signupClient(@RequestBody Admin admin) {
		return adminService.signupClient(admin);

	}

	@GetMapping("/{adminUsername}/{adminPassword}")
	public Admin getClientById(@PathVariable(value = "adminUsername") String adminUsername,
			@PathVariable(value = "adminPassword") String adminPassword) {
		return adminRepo.findByadminUsername(adminUsername);
	}

	@GetMapping("/Status/{adminIsDeleted}")
	public List<Admin> findadminIsDeleted(@PathVariable String adminIsDeleted) {
		return adminService.findbyadminIsDeleted(adminIsDeleted);
	}

}
