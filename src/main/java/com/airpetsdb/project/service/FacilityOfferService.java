package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.FacilityOffer;
import com.airpetsdb.project.repository.FacilityOfferRepository;

@Service
public class FacilityOfferService {
	@Autowired
	private FacilityOfferRepository offerRepo;

	public FacilityOffer submitMetadata(FacilityOffer facilityOffer) {
		return offerRepo.save(facilityOffer);
	}

	public List<FacilityOffer> findAll() {
		return offerRepo.findAll();
	}

	public List<FacilityOffer> displayOfferByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved) {
		return offerRepo.findByIsEvaluatedAndIsApproved(isEvaluated, isApproved);
	}

	public List<FacilityOffer> offerPetCCTV(String petCCTV, String isApproved) {
		return offerRepo.findByPetCCTVAndIsApproved(petCCTV, isApproved);
	}

	public List<FacilityOffer> offerPetBath(String petBath, String isApproved) {
		return offerRepo.findByPetBathAndIsApproved(petBath, isApproved);
	}

	public List<FacilityOffer> offerPetGroom(String petGroom, String isApproved) {
		return offerRepo.findByPetGroomAndIsApproved(petGroom, isApproved);
	}

	public List<FacilityOffer> offerPetVet(String petVet, String isApproved) {
		return offerRepo.findByPetVetAndIsApproved(petVet, isApproved);
	}

	public FacilityOffer displayUserMetaData(String facilityId) {
		return offerRepo.findByfacilityId(facilityId);
	}

	public FacilityOffer signupOffer(FacilityOffer facilityOffer) {
		// TODO Auto-generated method stub
		return offerRepo.save(facilityOffer);
	}

}
