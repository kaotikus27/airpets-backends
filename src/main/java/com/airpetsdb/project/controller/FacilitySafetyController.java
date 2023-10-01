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

import com.airpetsdb.project.model.FacilitySafety;
import com.airpetsdb.project.service.FacilitySafetyService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/facilitySafety")
public class FacilitySafetyController {
	@Autowired
	private FacilitySafetyService facilitySafetyService;

	@PostMapping("")
	private FacilitySafety submitFacilityOffer(@RequestBody FacilitySafety facilitySafety) {
		return facilitySafetyService.submitMetadata(facilitySafety);
	}

	@GetMapping("/{facilityId}")
	private FacilitySafety getFacilityDetails(@PathVariable("facilityId") String facilityId) {
		return facilitySafetyService.displayUserMetaData(facilityId);
	}

	@GetMapping("/byIsEvaluatedAndIsApproved/{isEvaluated}/{isApproved}")
	private List<FacilitySafety> getFacilitySafetyByIsEvaluatedAndIsApproved(
			@PathVariable("isEvaluated") String isEvaluated, @PathVariable("isApproved") String isApproved) {
		return facilitySafetyService.displayByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	@GetMapping("")
	public List<FacilitySafety> findAll() {
		return facilitySafetyService.findAll();
	}

	@PostMapping("/signupSafety")
	public FacilitySafety signupSafety(@RequestBody FacilitySafety facilitySafety) {
		return facilitySafetyService.signupSafety(facilitySafety);
	}
}
