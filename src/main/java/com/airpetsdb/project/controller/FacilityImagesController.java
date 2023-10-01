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

import com.airpetsdb.project.model.FacilityImages;
import com.airpetsdb.project.service.FacilityImagesService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/facilityImages")
public class FacilityImagesController {
	@Autowired
	private FacilityImagesService facilityImagesService;

	@PostMapping("")
	private FacilityImages submitFacilityImages(@RequestBody FacilityImages facilityImages) {
		return facilityImagesService.submitMetadata(facilityImages);
	}

	@GetMapping("/{facilityId}")
	private FacilityImages getFacilityImages(@PathVariable("facilityId") String facilityId) {
		return facilityImagesService.displayImagesMetaData(facilityId);
	}

	@GetMapping("/byIsEvaluatedAndIsApproved/{isEvaluated}/{isApproved}")
	private List<FacilityImages> getFacilityImagesByIsEvaluatedAndIsApproved(
			@PathVariable("isEvaluated") String isEvaluated, @PathVariable("isApproved") String isApproved) {
		return facilityImagesService.displayImagesByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	@GetMapping("")
	public List<FacilityImages> findAll() {
		return facilityImagesService.findAll();
	}

	@PostMapping("/signupImages")
	public FacilityImages signupImages(@RequestBody FacilityImages facilityImages) {
		return facilityImagesService.signupImages(facilityImages);
	}
}
