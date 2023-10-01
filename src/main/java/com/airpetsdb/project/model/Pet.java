package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "PetProfile")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String petId;
	private String userId;
	private String petName;
	private String petType;
//	private String transactionId;
	private String petBreed;
	private String petGender;
	private String bookingStatus;
	private String petImg;
	private String petDeleted;

	public Pet() {
		super();
	}

	public Pet(int id, String petId, String userId, String petName, String petType, String petBreed, String petGender,
			String bookingStatus, String petImg, String petDeleted) {
		super();
		this.id = id;
		this.petId = petId;
		this.userId = userId;
		this.petName = petName;
		this.petType = petType;
		this.petBreed = petBreed;
		this.petGender = petGender;
		this.bookingStatus = bookingStatus;
		this.petImg = petImg;
		this.petDeleted = petDeleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetBreed() {
		return petBreed;
	}

	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	public String getPetGender() {
		return petGender;
	}

	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getPetImg() {
		return petImg;
	}

	public void setPetImg(String petImg) {
		this.petImg = petImg;
	}

	public String getPetDeleted() {
		return petDeleted;
	}

	public void setPetDeleted(String petDeleted) {
		this.petDeleted = petDeleted;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", petId=" + petId + ", userId=" + userId + ", petName=" + petName + ", petType="
				+ petType + ", petBreed=" + petBreed + ", petGender=" + petGender + ", bookingStatus=" + bookingStatus
				+ ", petImg=" + petImg + ", petDeleted=" + petDeleted + "]";
	}

}
