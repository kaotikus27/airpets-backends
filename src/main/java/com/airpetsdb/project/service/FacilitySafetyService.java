package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.FacilitySafety;
import com.airpetsdb.project.repository.FacilitySafetyRepository;

@Service
public class FacilitySafetyService {
	@Autowired
	private FacilitySafetyRepository safetyRepo;

	public FacilitySafety submitMetadata(FacilitySafety facilitySafety) {
		return safetyRepo.save(facilitySafety);
	}

	public List<FacilitySafety> findAll() {
		return safetyRepo.findAll();
	}

	public List<FacilitySafety> displayByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved) {
		return safetyRepo.findByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	public FacilitySafety displayUserMetaData(String facilityId) {
		return safetyRepo.findByfacilityId(facilityId);
	}

	public FacilitySafety signupSafety(FacilitySafety facilitySafety) {
		// TODO Auto-generated method stub
		return safetyRepo.save(facilitySafety);
	}
}
