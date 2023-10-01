package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUserId(String userId);

	List<User> findAll();

	User findByemailAddress(String emailAddress);

//	List<User> updateUsers(int id, User users);

//	User updateUsers(int id, String userId);
}
