package com.airpetsdb.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "Admins")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String adminId;
	private String adminUsername;
	private String adminPassword;
	private String admintimeStamp;
	private String adminIsDeleted;
	
	
	public Admin(int id, String adminId, String adminUsername, String adminPassword, String admintimeStamp,String adminIsDeleted) {
		super();
		this.id = id;
		this.adminId = adminId;
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
		this.admintimeStamp = admintimeStamp;
		this.adminIsDeleted = adminIsDeleted;
	}


	public String getAdminIsDeleted() {
		return adminIsDeleted;
	}


	public void setAdminIsDeleted(String adminIsDeleted) {
		this.adminIsDeleted = adminIsDeleted;
	}


	public String getAdmintimeStamp() {
		return admintimeStamp;
	}

	public void setAdmintimeStamp(String admintimeStamp) {
		this.admintimeStamp = admintimeStamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	
	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}

}

