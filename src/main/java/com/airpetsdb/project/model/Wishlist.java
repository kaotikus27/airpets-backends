package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "WishlistInfo")
public class Wishlist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull // IDs for foreign keys
	private String wishlistId;
	private String userId;
	private String facilityId;
	private String addDate;
	private String addTime;

	private String isRemoved;

	public Wishlist() {
		super();
	}

	public Wishlist(int id, String wishlistId, String userId, String facilityId, String addDate, String addTime,
			String isRemoved) {
		super();
		this.id = id;
		this.wishlistId = wishlistId;
		this.userId = userId;
		this.facilityId = facilityId;
		this.addDate = addDate;
		this.addTime = addTime;
		this.isRemoved = isRemoved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(String wishlistId) {
		this.wishlistId = wishlistId;
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

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(String isRemoved) {
		this.isRemoved = isRemoved;
	}

	@Override
	public String toString() {
		return "Wishlist [id=" + id + ", wishlistId=" + wishlistId + ", userId=" + userId + ", facilityId=" + facilityId
				+ ", addDate=" + addDate + ", addTime=" + addTime + ", isRemoved=" + isRemoved + "]";
	}

}
