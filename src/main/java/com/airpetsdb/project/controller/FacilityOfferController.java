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

import com.airpetsdb.project.model.FacilityOffer;
import com.airpetsdb.project.service.FacilityOfferService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/facilityOffers")
public class FacilityOfferController {
	@Autowired
	private FacilityOfferService facilityOfferService;

	@PostMapping("")
	private FacilityOffer submitFacilityOffer(@RequestBody FacilityOffer facilityOffer) {
		return facilityOfferService.submitMetadata(facilityOffer);
	}

	@GetMapping("/{facilityId}")
	private FacilityOffer getFacilityDetails(@PathVariable("facilityId") String facilityId) {
		return facilityOfferService.displayUserMetaData(facilityId);
	}

	@GetMapping("/byIsEvaluatedAndIsApproved/{isEvaluated}/{isApproved}")
	private List<FacilityOffer> getFacilityOfferByIsEvaluatedAndIsApproved(
			@PathVariable("isEvaluated") String isEvaluated, @PathVariable("isApproved") String isApproved) {
		return facilityOfferService.displayOfferByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	@GetMapping("/cctvCount/{petCCTV}/{isApproved}")
	public List<FacilityOffer> findByfacilitypetCCTVAndIsApproved(@PathVariable("petCCTV") String petCCTV,
			@PathVariable("isApproved") String isApproved) {
		return facilityOfferService.offerPetCCTV(petCCTV, isApproved);
	}

	@GetMapping("/bathCount/{petBath}/{isApproved}")
	public List<FacilityOffer> findByfacilitypetBathAndIsApproved(@PathVariable("petBath") String petBath,
			@PathVariable("isApproved") String isApproved) {
		return facilityOfferService.offerPetBath(petBath, isApproved);
	}

	@GetMapping("/groomersCount/{petGroom}/{isApproved}")
	public List<FacilityOffer> findByfacilitypetGroomerAndIsApproved(@PathVariable("petGroom") String petGroom,
			@PathVariable("isApproved") String isApproved) {
		return facilityOfferService.offerPetGroom(petGroom, isApproved);
	}

	@GetMapping("/vetCount/{petVet}/{isApproved}")
	public List<FacilityOffer> findByfacilitypetVetAndIsApproved(@PathVariable("petVet") String petVet,
			@PathVariable("isApproved") String isApproved) {
		return facilityOfferService.offerPetVet(petVet, petVet);
	}

	@GetMapping("")
	public List<FacilityOffer> findAll() {
		return facilityOfferService.findAll();
	}

	@PostMapping("/signupOffer")
	public FacilityOffer signupOffer(@RequestBody FacilityOffer facilityOffer) {
		return facilityOfferService.signupOffer(facilityOffer);
	}

}
