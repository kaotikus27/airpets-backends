package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.Rating;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Integer> {

	List<Rating> findAll();

	Rating findByRatingId(String ratingId);

	Rating findByTransactionId(String transactionId);

	List<Rating> findByUserId(String userId);

	List<Rating> findByFacilityId(String facilityId);

	List<Rating> findByStar(String star);
}
