package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.Admin;
import com.airpetsdb.project.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	public Admin submitMetadata(Admin admin) {
		return adminRepository.save(admin);
	}

	public List<Admin> findAll() {
		return adminRepository.findAll();
	}

	public Admin displayUserMetaData(String adminid) {
		return adminRepository.findByAdminId(adminid);
	}

	public Admin signupClient(Admin admin) {
		return adminRepository.save(admin);
	}

	public List<Admin> findbyadminIsDeleted(String adminIsDeleted) {
		return adminRepository.findStatusByadminIsDeleted(adminIsDeleted);
	}

	public AdminService() {
		// TODO Auto-generated constructor stub
	}

}
