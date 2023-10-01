package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "FacilityOffers")
public class FacilityOffer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private String facilityId;
	// offers
	private String petGroom;
	private String petBath;
	private String petWalk;
	private String petPool;
	private String petAircon;
	private String petCCTV;
	private String petVet;
	private String petPickup;
	private String isEvaluated;
	private String isApproved;

	public FacilityOffer() {
		super();
	}

	public FacilityOffer(int id, String facilityId, String petGroom, String petBath, String petWalk, String petPool,
			String petAircon, String petCCTV, String petVet, String petPickup, String isEvaluated, String isApproved) {
		super();
		this.id = id;
		this.facilityId = facilityId;
		this.petGroom = petGroom;
		this.petBath = petBath;
		this.petWalk = petWalk;
		this.petPool = petPool;
		this.petAircon = petAircon;
		this.petCCTV = petCCTV;
		this.petVet = petVet;
		this.petPickup = petPickup;
		this.isEvaluated = isEvaluated;
		this.isApproved = isApproved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public String getPetGroom() {
		return petGroom;
	}

	public void setPetGroom(String petGroom) {
		this.petGroom = petGroom;
	}

	public String getPetBath() {
		return petBath;
	}

	public void setPetBath(String petBath) {
		this.petBath = petBath;
	}

	public String getPetWalk() {
		return petWalk;
	}

	public void setPetWalk(String petWalk) {
		this.petWalk = petWalk;
	}

	public String getPetPool() {
		return petPool;
	}

	public void setPetPool(String petPool) {
		this.petPool = petPool;
	}

	public String getPetAircon() {
		return petAircon;
	}

	public void setPetAircon(String petAircon) {
		this.petAircon = petAircon;
	}

	public String getPetCCTV() {
		return petCCTV;
	}

	public void setPetCCTV(String petCCTV) {
		this.petCCTV = petCCTV;
	}

	public String getPetVet() {
		return petVet;
	}

	public void setPetVet(String petVet) {
		this.petVet = petVet;
	}

	public String getPetPickup() {
		return petPickup;
	}

	public void setPetPickup(String petPickup) {
		this.petPickup = petPickup;
	}

	public String getIsEvaluated() {
		return isEvaluated;
	}

	public void setIsEvaluated(String isEvaluated) {
		this.isEvaluated = isEvaluated;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	@Override
	public String toString() {
		return "FacilityOffer [id=" + id + ", facilityId=" + facilityId + ", petGroom=" + petGroom + ", petBath="
				+ petBath + ", petWalk=" + petWalk + ", petPool=" + petPool + ", petAircon=" + petAircon + ", petCCTV="
				+ petCCTV + ", petVet=" + petVet + ", petPickup=" + petPickup + ", isEvaluated=" + isEvaluated
				+ ", isApproved=" + isApproved + "]";
	}

}
