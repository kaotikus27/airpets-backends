package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "BookingInfo")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull // IDs for foreign keys
	private String transactionId;
	private String userId;
	private String facilityId;
	private String petId;

	private String petComment;

	private String paymentMethod;
	private String checkinDate;
	private String checkoutDate;
	private String paymentStatus;
	private String paymentDate;
	private String paymentTime;
	private String totalBill;
	private String bookingStatus;
	private String financialService;

	private String isCompleted;
	private String isRated;

	private String facilityCancelNote;

	public Booking() {
		super();
	}

	public Booking(int id, String transactionId, String userId, String facilityId, String petId, String petComment,
			String paymentMethod, String checkinDate, String checkoutDate, String paymentStatus, String paymentDate,
			String paymentTime, String totalBill, String bookingStatus, String financialService, String isCompleted,
			String isRated, String facilityCancelNote) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.userId = userId;
		this.facilityId = facilityId;
		this.petId = petId;
		this.petComment = petComment;
		this.paymentMethod = paymentMethod;
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
		this.paymentTime = paymentTime;
		this.totalBill = totalBill;
		this.bookingStatus = bookingStatus;
		this.financialService = financialService;
		this.isCompleted = isCompleted;
		this.isRated = isRated;
		this.facilityCancelNote = facilityCancelNote;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPetComment() {
		return petComment;
	}

	public void setPetComment(String petComment) {
		this.petComment = petComment;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}

	public String getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getFinancialService() {
		return financialService;
	}

	public void setFinancialService(String financialService) {
		this.financialService = financialService;
	}

	public String getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(String isCompleted) {
		this.isCompleted = isCompleted;
	}

	public String getIsRated() {
		return isRated;
	}

	public void setIsRated(String isRated) {
		this.isRated = isRated;
	}

	public String getFacilityCancelNote() {
		return facilityCancelNote;
	}

	public void setFacilityCancelNote(String facilityCancelNote) {
		this.facilityCancelNote = facilityCancelNote;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", transactionId=" + transactionId + ", userId=" + userId + ", facilityId="
				+ facilityId + ", petId=" + petId + ", petComment=" + petComment + ", paymentMethod=" + paymentMethod
				+ ", checkinDate=" + checkinDate + ", checkoutDate=" + checkoutDate + ", paymentStatus=" + paymentStatus
				+ ", paymentDate=" + paymentDate + ", paymentTime=" + paymentTime + ", totalBill=" + totalBill
				+ ", bookingStatus=" + bookingStatus + ", financialService=" + financialService + ", isCompleted="
				+ isCompleted + ", isRated=" + isRated + ", facilityCancelNote=" + facilityCancelNote + "]";
	}

}
