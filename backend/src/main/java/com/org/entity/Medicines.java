package com.org.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Medicines implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int mid;
	private String mname;
	private int mprice;
	private String mdesc;
	private String mcategory;
	private String expiredate;
	private int mcontrol;
	
	@ManyToMany
	@JoinTable(name="orders",
		joinColumns = @JoinColumn(name = "mid"),
		inverseJoinColumns = @JoinColumn(name = "uid"))
	private List<User> users=new ArrayList<>();
	
	public Medicines() {
		
	}

	public Medicines(int mid, String mname, int mprice, String mdesc, String mcategory, String expiredate,
			int mcontrol) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
		this.mdesc = mdesc;
		this.mcategory = mcategory;
		this.expiredate = expiredate;
		this.mcontrol = mcontrol;
		this.users = users;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMprice() {
		return mprice;
	}

	public void setMprice(int mprice) {
		this.mprice = mprice;
	}

	public String getMdesc() {
		return mdesc;
	}

	public void setMdesc(String mdesc) {
		this.mdesc = mdesc;
	}

	public String getMcategory() {
		return mcategory;
	}

	public void setMcategory(String mcategory) {
		this.mcategory = mcategory;
	}

	public String getExpiredate() {
		return expiredate;
	}

	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}

	public int getMcontrol() {
		return mcontrol;
	}

	public void setMcontrol(int mcontrol) {
		this.mcontrol = mcontrol;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void addUsers(User user) {
		this.users.add(user);
	}
	
}
