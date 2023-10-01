package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "BookingAddons")
public class BookingAddons {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String transactionId;

	private String petVet;
	private String petBath;
	private String petCCTV;
	private String petGroom;

	public BookingAddons() {
		super();
	}

	public BookingAddons(int id, String transactionId, String petVet, String petBath, String petCCTV, String petGroom) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.petVet = petVet;
		this.petBath = petBath;
		this.petCCTV = petCCTV;
		this.petGroom = petGroom;
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

	public String getPetVet() {
		return petVet;
	}

	public void setPetVet(String petVet) {
		this.petVet = petVet;
	}

	public String getPetBath() {
		return petBath;
	}

	public void setPetBath(String petBath) {
		this.petBath = petBath;
	}

	public String getPetCCTV() {
		return petCCTV;
	}

	public void setPetCCTV(String petCCTV) {
		this.petCCTV = petCCTV;
	}

	public String getPetGroom() {
		return petGroom;
	}

	public void setPetGroom(String petGroom) {
		this.petGroom = petGroom;
	}

	@Override
	public String toString() {
		return "BookingAddons [id=" + id + ", transactionId=" + transactionId + ", petVet=" + petVet + ", petBath="
				+ petBath + ", petCCTV=" + petCCTV + ", petGroom=" + petGroom + "]";
	}
}
