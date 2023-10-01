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

import com.airpetsdb.project.model.FacilityMod;
import com.airpetsdb.project.service.FacilityService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/facility")
public class FacilityController {
	@Autowired
	private FacilityService facilityService;

	@PostMapping("")
	private FacilityMod submitFacility(@RequestBody FacilityMod facilityMod) {
		return facilityService.submitMetadata(facilityMod);
	}

	@GetMapping("/byFacility/{facilityId}")
	private FacilityMod getFacilityDetails(@PathVariable("facilityId") String facilityId) {
		return facilityService.displayFacilityMetadata(facilityId);
	}

	@GetMapping("/byUser/{userId}")
	private FacilityMod getFacilityDetailsByUser(@PathVariable("userId") String userId) {
		return facilityService.displayFacilityMetadataByUser(userId);
	}

	@GetMapping("/byCity/{facilityCity}")
	private List<FacilityMod> getFacilitiesByCity(@PathVariable("facilityCity") String facilityCity) {
		return facilityService.displayAllFacilityByCity(facilityCity);
	}

	@GetMapping("/byPriceRate/{priceRate}")
	private List<FacilityMod> getFacilitesByPriceRate(@PathVariable("priceRate") String priceRate) {
		return facilityService.displayFacilityByPriceRate(priceRate);
	}

	@GetMapping("/byIsEvaluatedAndIsApproved/{isEvaluated}/{isApproved}")
	private List<FacilityMod> getFacilitiesByIsApprovedAndIsEvaluated(@PathVariable("isEvaluated") String isEvaluated,
			@PathVariable("isApproved") String isApproved) {
		return facilityService.displayFacilityByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	@GetMapping("/byTypeOfPlaceAndIsApproved/{typeOfPlace}/{isApproved}")
	private List<FacilityMod> getFacilitiesByTypeOfPlaceAndIsApproved(@PathVariable("typeOfPlace") String typeOfPlace,
			@PathVariable("isApproved") String isApproved) {
		return facilityService.displayFacilityByTypeOfPlaceAndIsApproved(typeOfPlace, isApproved);
	}

	@GetMapping("")
	public List<FacilityMod> findAll() {
		return facilityService.findall();
	}

	@PostMapping("/signupFacility")
	public FacilityMod signupFacility(@RequestBody FacilityMod facilityMod) {
		return facilityService.signupFacility(facilityMod);
	}

}
