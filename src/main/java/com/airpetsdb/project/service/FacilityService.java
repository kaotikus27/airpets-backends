package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.FacilityMod;
import com.airpetsdb.project.repository.FacilityRepository;

@Service
public class FacilityService {
	@Autowired
	private FacilityRepository facilityRepository;

	public FacilityMod submitMetadata(FacilityMod facilityMod) {
		return facilityRepository.save(facilityMod);
	}

	public List<FacilityMod> findall() {
		return facilityRepository.findAll();
	}

	public FacilityMod displayFacilityMetadata(String facilityId) {
		return facilityRepository.findByFacilityId(facilityId);
	}

	public FacilityMod displayFacilityMetadataByUser(String userId) {
		return facilityRepository.findByUserId(userId);
	}

	public FacilityMod signupFacility(FacilityMod facilityMod) {
		return facilityRepository.save(facilityMod);
	}

	public List<FacilityMod> displayAllFacilityByCity(String facilityCity) {
		return facilityRepository.findByFacilityCity(facilityCity);
	}

	public List<FacilityMod> displayFacilityByPriceRate(String priceRate) {
		return facilityRepository.findByPriceRate(priceRate);
	}

	public List<FacilityMod> displayFacilityByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved) {
		return facilityRepository.findByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	public List<FacilityMod> displayFacilityByTypeOfPlaceAndIsApproved(String typeOfPlace, String isApproved) {
		return facilityRepository.findByTypeOfPlaceAndIsApproved(typeOfPlace, isApproved);
	}
}
