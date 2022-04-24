package com.org.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int uid;
	private String uname;
	private int uage;
	private String uemail;
	private String upassword;
	
	@ManyToMany(mappedBy = "users")
	@JsonIgnore
	private List<Medicines> meds=new ArrayList<>();
	
	public User() {
		
	}

	public User(int uid, String uname, int uage, String uemail, String upassword) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
		this.uemail = uemail;
		this.upassword = upassword;
		this.meds = meds;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
	public List<Medicines> getMeds() {
		return meds;
	}

	public void addMeds(Medicines med) {
		this.meds.add(med);
	}
	
}
