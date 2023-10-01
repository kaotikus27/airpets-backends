package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "FacilityInfo")
public class FacilityMod {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String userId;
	@NotNull
	private String facilityId;
	// register hotel
	private String typeOfPlace;
	private String handledPersonally;
	private String privateRoom;
	private String sharedRoom;
	// address
	private String facilityStreet;
	private String facilityBrgy;
	private String facilityCity;
	private String facilityState;
	private String facilityZip;
	private String roomNum;
	private String roomBooked;
	private String playground;
	private String petBed;
	private String petBathroom;
//	private String facilityImage;
	private String facilityTitle;
	private String facilityDesc;
	private String priceRate;
	private String isApproved;
	private String createdTime;
	private String createdDay;
	private String isEvaluated;
//	private int facilitySafety;
//	private int facilityAmenities;

	public FacilityMod() {
		super();
	}

	public FacilityMod(int id, String userId, String facilityId, String typeOfPlace, String handledPersonally,
			String privateRoom, String sharedRoom, String facilityStreet, String facilityBrgy, String facilityCity,
			String facilityState, String facilityZip, String roomNum, String roomBooked, String playground,
			String petBed, String petBathroom, String facilityTitle, String facilityDesc, String priceRate,
			String isApproved, String createdTime, String createdDay, String isEvaluated) {
		super();
		this.id = id;
		this.userId = userId;
		this.facilityId = facilityId;
		// Informations
		this.typeOfPlace = typeOfPlace;
		this.handledPersonally = handledPersonally;
		this.privateRoom = privateRoom;
		this.sharedRoom = sharedRoom;
		this.facilityStreet = facilityStreet;
		this.facilityBrgy = facilityBrgy;
		this.facilityCity = facilityCity;
		this.facilityState = facilityState;
		this.facilityZip = facilityZip;
		this.roomNum = roomNum;
		this.roomBooked = roomBooked;
		this.playground = playground;
		this.petBed = petBed;
		this.petBathroom = petBathroom;
//		this.facilityImage = facilityImage;
		this.facilityTitle = facilityTitle;
		this.facilityDesc = facilityDesc;
		this.priceRate = priceRate;
		this.isApproved = isApproved;
		this.createdTime = createdTime;
		this.createdDay = createdDay;
		this.isEvaluated = isEvaluated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getfacilityId() {
		return facilityId;
	}

	public void setHotelId(String hotelId) {
		this.facilityId = hotelId;
	}

	public String getTypeOfPlace() {
		return typeOfPlace;
	}

	public void setTypeOfPlace(String typeOfPlace) {
		this.typeOfPlace = typeOfPlace;
	}

	public String getHandledPersonally() {
		return handledPersonally;
	}

	public void setHandledPersonally(String handledPersonally) {
		this.handledPersonally = handledPersonally;
	}

	public String getPrivateRoom() {
		return privateRoom;
	}

	public void setPrivateRoom(String privateRoom) {
		this.privateRoom = privateRoom;
	}

	public String getSharedRoom() {
		return sharedRoom;
	}

	public void setSharedRoom(String sharedRoom) {
		this.sharedRoom = sharedRoom;
	}

	public String getfacilityStreet() {
		return facilityStreet;
	}

	public void setfacilityStreet(String facilityStreet) {
		this.facilityStreet = facilityStreet;
	}

	public String getfacilityBrgy() {
		return facilityBrgy;
	}

	public void setfacilityBrgy(String facilityBrgy) {
		this.facilityBrgy = facilityBrgy;
	}

	public String getfacilityCity() {
		return facilityCity;
	}

	public void setfacilityCity(String facilityCity) {
		this.facilityCity = facilityCity;
	}

	public String getfacilityState() {
		return facilityState;
	}

	public void setfacilityState(String facilityState) {
		this.facilityState = facilityState;
	}

	public String getfacilityZip() {
		return facilityZip;
	}

	public void setfacilityZip(String facilityZip) {
		this.facilityZip = facilityZip;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getRoomBooked() {
		return roomBooked;
	}

	public void setRoomBooked(String roomBooked) {
		this.roomBooked = roomBooked;
	}

	public String getPlayground() {
		return playground;
	}

	public void setPlayground(String playground) {
		this.playground = playground;
	}

	public String getPetBed() {
		return petBed;
	}

	public void setPetBed(String petBed) {
		this.petBed = petBed;
	}

	public String getPetBathroom() {
		return petBathroom;
	}

	public void setPetBathroom(String petBathroom) {
		this.petBathroom = petBathroom;
	}

//	public String getFacilityImage() {
//		return facilityImage;
//	}
//
//	public void setFacilityImage(String facilityImage) {
//		this.facilityImage = facilityImage;
//	}

	public String getFacilityTitle() {
		return facilityTitle;
	}

	public void setFacilityTitle(String facilityTitle) {
		this.facilityTitle = facilityTitle;
	}

	public String getFacilityDesc() {
		return facilityDesc;
	}

	public void setFacilityDesc(String facilityDesc) {
		this.facilityDesc = facilityDesc;
	}

	public String getPriceRate() {
		return priceRate;
	}

	public void setPriceRate(String priceRate) {
		this.priceRate = priceRate;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatedDay() {
		return createdDay;
	}

	public void setCreatedDay(String createdDay) {
		this.createdDay = createdDay;
	}

	public String getIsEvaluated() {
		return isEvaluated;
	}

	public void setIsEvaluated(String isEvaluated) {
		this.isEvaluated = isEvaluated;
	}

	@Override
	public String toString() {
		return "FacilityMod [id=" + id + ", userId=" + userId + ", facilityId=" + facilityId + ", typeOfPlace="
				+ typeOfPlace + ", handledPersonally=" + handledPersonally + ", privateRoom=" + privateRoom
				+ ", sharedRoom=" + sharedRoom + ", facilityStreet=" + facilityStreet + ", facilityBrgy=" + facilityBrgy
				+ ", facilityCity=" + facilityCity + ", facilityState=" + facilityState + ", facilityZip=" + facilityZip
				+ ", roomNum=" + roomNum + ", roomBooked=" + roomBooked + ", playground=" + playground + ", petBed="
				+ petBed + ", petBathroom=" + petBathroom + ", facilityTitle=" + facilityTitle + ", facilityDesc="
				+ facilityDesc + ", priceRate=" + priceRate + ", isApproved=" + isApproved + ", createdTime="
				+ createdTime + ", createdDay=" + createdDay + ", isEvaluated=" + isEvaluated + "]";
	}

//	public int getFacilitySafety() {
//		return facilitySafety;
//	}
//
//	public void setFacilitySafety(int facilitySafety) {
//		this.facilitySafety = facilitySafety;
//	}
//
//	public int getFacilityAmenities() {
//		return facilityAmenities;
//	}
//
//	public void setFacilityAmenities(int facilityAmenities) {
//		this.facilityAmenities = facilityAmenities;
//	}

}
