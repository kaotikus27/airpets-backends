package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.airpetsdb.project.model.FacilityImages;

public interface FacilityImagesRepository extends CrudRepository<FacilityImages, Integer> {

	FacilityImages findByFacilityId(String facilityId);

	List<FacilityImages> findAll();

	List<FacilityImages> findByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved);
}
