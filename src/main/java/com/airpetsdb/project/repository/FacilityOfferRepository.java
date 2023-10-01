package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.FacilityOffer;

@Repository
public interface FacilityOfferRepository extends CrudRepository<FacilityOffer, Integer> {

	FacilityOffer findByfacilityId(String facilityId);

	List<FacilityOffer> findAll();

	List<FacilityOffer> findByIsEvaluatedAndIsApproved(String isEvaluated, String isApproved);

	List<FacilityOffer> findByPetCCTVAndIsApproved(String petCCTV, String isApproved);

	List<FacilityOffer> findByPetBathAndIsApproved(String petBath, String isApproved);

	List<FacilityOffer> findByPetGroomAndIsApproved(String petGroom, String isApproved);

	List<FacilityOffer> findByPetVetAndIsApproved(String petVet, String isApproved);
}
