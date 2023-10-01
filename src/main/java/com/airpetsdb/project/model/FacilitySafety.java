package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "FacilitySafety")
public class FacilitySafety {
	// safetyId integer
	// safetySmoke string
	// safeyFire string
	// safetyKit string
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private String facilityId;
	// Safety
	private String safetySmoke;
	private String safetyFire;
	private String safetyKit;
	private String isApproved;
	private String isEvaluated;

	public FacilitySafety() {
		super();
	}

	public FacilitySafety(int id, String facilityId, String safetySmoke, String safetyFire, String safetyKit,
			String isApproved, String isEvaluated) {
		super();
		this.id = id;
		this.facilityId = facilityId;
		this.safetySmoke = safetySmoke;
		this.safetyFire = safetyFire;
		this.safetyKit = safetyKit;
		this.isApproved = isApproved;
		this.isEvaluated = isEvaluated;
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

	public String getSafetySmoke() {
		return safetySmoke;
	}

	public void setSafetySmoke(String safetySmoke) {
		this.safetySmoke = safetySmoke;
	}

	public String getSafetyFire() {
		return safetyFire;
	}

	public void setSafetyFire(String safetyFire) {
		this.safetyFire = safetyFire;
	}

	public String getSafetyKit() {
		return safetyKit;
	}

	public void setSafetyKit(String safetyKit) {
		this.safetyKit = safetyKit;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public String getIsEvaluated() {
		return isEvaluated;
	}

	public void setIsEvaluated(String isEvaluated) {
		this.isEvaluated = isEvaluated;
	}

}
