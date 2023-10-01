package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.FacilityImages;
import com.airpetsdb.project.repository.FacilityImagesRepository;

@Service
public class FacilityImagesService {
	@Autowired
	private FacilityImagesRepository imagesRepository;

	public FacilityImages submitMetadata(FacilityImages facilityImages) {
		return imagesRepository.save(facilityImages);
	}

	public List<FacilityImages> findAll() {
		return imagesRepository.findAll();
	}

	public FacilityImages displayImagesMetaData(String facilityId) {
		return imagesRepository.findByFacilityId(facilityId);
	}

	public FacilityImages signupImages(FacilityImages facilityImages) {
		return imagesRepository.save(facilityImages);
	}

	public List<FacilityImages> displayImagesByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved) {
		return imagesRepository.findByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}
}
