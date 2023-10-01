package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String userId;

	// register
	private String firstName;
	private String lastName;
	private String userName;
	private String emailAddress;
	private String mobileNumber;
	private String password;
	// front
	private String address;
	private String imgUrl;
	private String airpets;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userId, String firstName, String lastName, String userName, String emailAddress,
			String mobileNumber, String password, String address, String imgUrl, String airpets) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.address = address;
		this.imgUrl = imgUrl;
		this.airpets = airpets;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAirpets() {
		return airpets;
	}

	public void setAirpets(String airpets) {
		this.airpets = airpets;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", emailAddress=" + emailAddress + ", mobileNumber=" + mobileNumber + ", password=" + password
				+ ", address=" + address + ", imgUrl=" + imgUrl + ", airpets=" + airpets + "]";
	}

//	
//	
}
