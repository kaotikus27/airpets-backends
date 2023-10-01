package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "FacilityAmenity")
public class FacilityAmenity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String facilityId;
	// AMENITIES
	private String freePark;
	private String wifi;
	private String paidPark;
	private String waitingArea;
	private String isApproved;
	private String isEvaluated;

	public FacilityAmenity() {
		super();
	}

	public FacilityAmenity(int id, String facilityId, String freePark, String wifi, String paidPark, String waitingArea,
			String isApproved, String isEvaluated) {
		super();
		this.id = id;
		this.facilityId = facilityId;
		this.freePark = freePark;
		this.wifi = wifi;
		this.paidPark = paidPark;
		this.waitingArea = waitingArea;
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

	public String getFreePark() {
		return freePark;
	}

	public void setFreePark(String freePark) {
		this.freePark = freePark;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getPaidPark() {
		return paidPark;
	}

	public void setPaidPark(String paidPark) {
		this.paidPark = paidPark;
	}

	public String getWaitingArea() {
		return waitingArea;
	}

	public void setWaitingArea(String waitingArea) {
		this.waitingArea = waitingArea;
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

	@Override
	public String toString() {
		return "FacilityAmenity [id=" + id + ", facilityId=" + facilityId + ", freePark=" + freePark + ", wifi=" + wifi
				+ ", paidPark=" + paidPark + ", waitingArea=" + waitingArea + ", isApproved=" + isApproved
				+ ", isEvaluated=" + isEvaluated + "]";
	}

}
