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

import com.airpetsdb.project.model.Pet;
import com.airpetsdb.project.service.PetService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/pets")
public class PetController {
	@Autowired
	private PetService petService;
//	@Autowired
//	private PetsRepository petRepo;

	@PostMapping("")
	private Pet submitPets(@RequestBody Pet pet) {
		return petService.submitMetadata(pet);
	}

	@GetMapping("/byPetId/{petid}")
	private Pet getPetsDetailsByPetId(@PathVariable("petid") String petId) {
		return petService.displayUserMetaData(petId);
	}

	@GetMapping("/byUserId/{userId}")
	private List<Pet> getPetDetailsByUserId(@PathVariable("userId") String userId) {
		return petService.displayPetDetailsByUserId(userId);
	}

	@GetMapping("/byBookingStatus/{bookingStatus}")
	private List<Pet> getPetDetailsByTransactionId(@PathVariable("bookingStatus") String bookingStatus) {
		return petService.displayPetDetailsByBookingStatus(bookingStatus);
	}

	@GetMapping("/byPetDeleted/{petDeleted}")
	private List<Pet> getPetDetailsByPetDeleted(@PathVariable("petDeleted") String petDeleted) {
		return petService.displayPetDetailsByPetDeleted(petDeleted);
	}

	@GetMapping("/byUserIdAndPetDeleted/{userId}/{petDeleted}")
	private List<Pet> getPetDetailsByUserIdAndPetDeleted(@PathVariable("userId") String userId,
			@PathVariable("petDeleted") String petDeleted) {
		return petService.displayPetDetailsByUserIdAndPetDeleted(userId, petDeleted);
	}

	@GetMapping("")
	public List<Pet> findAll() {
		return petService.findAll();
	}

	@PostMapping("/addPet")
	public Pet addPets(@RequestBody Pet pet) {
		return petService.addPets(pet);
	}
}
