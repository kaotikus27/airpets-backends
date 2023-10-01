package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.Pet;
import com.airpetsdb.project.repository.PetRepository;

@Service
public class PetService {
	@Autowired
	private PetRepository petRepo;

	public Pet submitMetadata(Pet pets) {
		return petRepo.save(pets);
	}

	public List<Pet> findAll() {
		return petRepo.findAll();
	}

	public Pet displayUserMetaData(String petid) {
		return petRepo.findByPetId(petid);
	}

	public List<Pet> displayPetDetailsByUserId(String userId) {
		return petRepo.findByUserId(userId);
	}

	public List<Pet> displayPetDetailsByBookingStatus(String transactionId) {
		return petRepo.findByBookingStatus(transactionId);
	}

	public List<Pet> displayPetDetailsByPetDeleted(String petDeleted) {
		return petRepo.findPetsByPetDeleted(petDeleted);
	}

	public List<Pet> displayPetDetailsByUserIdAndPetDeleted(String userId, String petDeleted) {
		return petRepo.findPetsByUserIdAndPetDeleted(userId, petDeleted);
	}

	public Pet addPets(Pet pets) {
		return petRepo.save(pets);
	}
}
