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

import com.airpetsdb.project.model.Rating;
import com.airpetsdb.project.service.RatingService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/ratings")
public class RatingController {
	@Autowired
	private RatingService ratingService;

	@PostMapping("")
	private Rating submitRating(@RequestBody Rating rating) {
		return ratingService.submitMetadata(rating);
	}

	@GetMapping("/byRatingId/{ratingId}")
	private Rating getRatingDetails(@PathVariable("ratingId") String ratingId) {
		return ratingService.displayRatingByRatingId(ratingId);
	}

	@GetMapping("/byTransactionId/{transactionId}")
	private Rating getRatingDetailsByTransactionId(@PathVariable("transactionId") String transactionId) {
		return ratingService.displayRatingByTransactionId(transactionId);
	}

	@GetMapping("/byUser/{userId}")
	private List<Rating> getAllRatingByUserId(@PathVariable("userId") String userId) {
		return ratingService.displayAllRatingByUserId(userId);
	}

	@GetMapping("/byFacility/{facilityId}")
	private List<Rating> getAllRatingByFaclityId(@PathVariable("facilityId") String facilityId) {
		return ratingService.displayAllRatingByFacilityId(facilityId);
	}

	@GetMapping("/byStar/{star}")
	private List<Rating> getAllRatingByStar(@PathVariable("star") String star) {
		return ratingService.displayAllRatingByStar(star);
	}

	@GetMapping("")
	public List<Rating> findAll() {
		return ratingService.findAll();
	}

	@PostMapping("/addRating")
	public Rating addrating(@RequestBody Rating rating) {
		return ratingService.addRating(rating);
	}
}
