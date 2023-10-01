package com.airpetsdb.project.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

	Admin findByAdminId(String adminId);

	List<Admin> findAll();

	Admin findByadminUsername(String adminUsername);

	ArrayList<Admin> findStatusByadminIsDeleted(String adminIsDeleted);
}