package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "RatingsInfo")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String ratingId;
	private String transactionId;
	private String userId;
	private String facilityId;
	private String petId;

	private String star;
	private String comment;

	private String ratingDate;
	private String ratingTime;

	public Rating() {
		super();
	}

	public Rating(int id, String ratingId, String transactionId, String userId, String facilityId, String petId,
			String star, String comment, String ratingDate, String ratingTime) {
		super();
		this.id = id;
		this.ratingId = ratingId;
		this.transactionId = transactionId;
		this.userId = userId;
		this.facilityId = facilityId;
		this.petId = petId;
		this.star = star;
		this.comment = comment;
		this.ratingDate = ratingDate;
		this.ratingTime = ratingTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRatingDate() {
		return ratingDate;
	}

	public void setRatingDate(String ratingDate) {
		this.ratingDate = ratingDate;
	}

	public String getRatingTime() {
		return ratingTime;
	}

	public void setRatingTime(String ratingTime) {
		this.ratingTime = ratingTime;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", ratingId=" + ratingId + ", transactionId=" + transactionId + ", userId=" + userId
				+ ", facilityId=" + facilityId + ", petId=" + petId + ", star=" + star + ", comment=" + comment
				+ ", ratingDate=" + ratingDate + ", ratingTime=" + ratingTime + "]";
	}

}
