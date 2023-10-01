package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.User;
import com.airpetsdb.project.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User submitMetadata(User user) {
		return userRepository.save(user);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User displayUserMetaData(String userid) {
		return userRepository.findByUserId(userid);
	}

	public User signupClient(User user) {
		return userRepository.save(user);
	}

//	public User updateUsers(int id, User user) {
//		return userRepository.save(user);
//	}
}
