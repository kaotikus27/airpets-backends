package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.FacilityMod;

@Repository
public interface FacilityRepository extends CrudRepository<FacilityMod, Integer> {

	FacilityMod findByFacilityId(String facilityId);

	FacilityMod findByUserId(String userId);

	List<FacilityMod> findAll();

	List<FacilityMod> findByFacilityCity(String facilityCity);

	List<FacilityMod> findByPriceRate(String priceRate);

	List<FacilityMod> findByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved);

	List<FacilityMod> findByTypeOfPlaceAndIsApproved(String typeOfPlace, String isApproved);

//	FacilityMod findByEmailAddress(String emailAddress);

}
