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

import com.airpetsdb.project.model.FacilityAmenity;
import com.airpetsdb.project.service.FacilityAmenityService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/facilityAmenity")
public class FacilityAmenityController {
	@Autowired
	private FacilityAmenityService facilityAmenityService;

	@PostMapping("")
	private FacilityAmenity submitFacilityAmenity(@RequestBody FacilityAmenity facilityAmenity) {
		return facilityAmenityService.submitMetadata(facilityAmenity);
	}

	@GetMapping("/{facilityId}")
	private FacilityAmenity getFacilityDetails(@PathVariable("facilityId") String facilityId) {
		return facilityAmenityService.displayUserMetaData(facilityId);
	}

	@GetMapping("/byIsEvaluatedAndIsApproved/{isEvaluated}/{isApproved}")
	private List<FacilityAmenity> getFacilitiesByIsEvaluatedAndIsApproved(
			@PathVariable("isEvaluated") String isEvaluated, @PathVariable("isApproved") String isApproved) {
		return facilityAmenityService.displayFacilityAmenityByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	@GetMapping("")
	public List<FacilityAmenity> findAll() {
		return facilityAmenityService.findAll();
	}

	@PostMapping("/signupAmenity")
	public FacilityAmenity signupAmenity(@RequestBody FacilityAmenity facilityAmenity) {
		return facilityAmenityService.signupAmenity(facilityAmenity);
	}
}
