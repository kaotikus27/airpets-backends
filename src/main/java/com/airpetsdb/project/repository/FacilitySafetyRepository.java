package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.FacilitySafety;

@Repository
public interface FacilitySafetyRepository extends CrudRepository<FacilitySafety, Integer> {

	FacilitySafety findByfacilityId(String facilityId);

	List<FacilitySafety> findAll();

	List<FacilitySafety> findByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved);
}
