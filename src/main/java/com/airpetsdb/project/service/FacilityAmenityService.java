package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.FacilityAmenity;
import com.airpetsdb.project.repository.FacilityAmenityRepository;

@Service
public class FacilityAmenityService {
	@Autowired
	private FacilityAmenityRepository amenityRepo;

	public FacilityAmenity submitMetadata(FacilityAmenity facilityAmenity) {
		return amenityRepo.save(facilityAmenity);
	}

	public List<FacilityAmenity> findAll() {
		return amenityRepo.findAll();
	}

	public List<FacilityAmenity> displayFacilityAmenityByIsEvaluatedAndIsApproved(String isEvaluated,
			String isApproved) {
		return amenityRepo.findByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	public FacilityAmenity displayUserMetaData(String facilityId) {
		return amenityRepo.findByfacilityId(facilityId);
	}

	public FacilityAmenity signupAmenity(FacilityAmenity facilityAmenity) {
		// TODO Auto-generated method stub
		return amenityRepo.save(facilityAmenity);
	}
}
