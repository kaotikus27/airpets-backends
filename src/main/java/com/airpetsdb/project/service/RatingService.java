package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.Rating;
import com.airpetsdb.project.repository.RatingRepository;

@Service
public class RatingService {
	@Autowired
	private RatingRepository ratingRepo;

	public Rating submitMetadata(Rating rating) {
		return ratingRepo.save(rating);
	}

	public List<Rating> findAll() {
		return ratingRepo.findAll();
	}

	public Rating displayRatingByRatingId(String ratingId) {
		return ratingRepo.findByRatingId(ratingId);
	}

	public Rating displayRatingByTransactionId(String transactionId) {
		return ratingRepo.findByTransactionId(transactionId);
	}

	public List<Rating> displayAllRatingByUserId(String userId) {
		return ratingRepo.findByUserId(userId);
	}

	public List<Rating> displayAllRatingByFacilityId(String facilityId) {
		return ratingRepo.findByFacilityId(facilityId);
	}

	public List<Rating> displayAllRatingByStar(String star) {
		return ratingRepo.findByStar(star);
	}

	public Rating addRating(Rating rating) {
		return ratingRepo.save(rating);
	}
}
