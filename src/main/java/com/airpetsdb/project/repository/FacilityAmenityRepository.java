package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.FacilityAmenity;

@Repository
public interface FacilityAmenityRepository extends CrudRepository<FacilityAmenity, Integer> {

	FacilityAmenity findByfacilityId(String facilityId);

	List<FacilityAmenity> findAll();

	List<FacilityAmenity> findByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved);
}
