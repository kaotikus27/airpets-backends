package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet, Integer> {

	Pet findByPetId(String petId);

	List<Pet> findByUserId(String userId);

	List<Pet> findByBookingStatus(String transactionId);

	List<Pet> findAll();

	List<Pet> findPetsByPetDeleted(String petDeleted);

	List<Pet> findPetsByUserIdAndPetDeleted(String userId, String petDeleted);
}
