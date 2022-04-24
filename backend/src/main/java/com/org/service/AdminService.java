package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.entity.Admin;
import com.org.entity.AdminRepo;

@Service
public class AdminService {

	@Autowired
	AdminRepo arepo;
	
	public Admin addAdmin(Admin admin)
	{
		return arepo.save(admin);
	}
	
	public List<Admin> getAllAdmin() {
		return arepo.findAll();
	}
	
	public Admin updateAdmin(Admin admin)
	{
		Admin a1=arepo.searchAdmin(admin.getAname());
		a1.setApassword(admin.getApassword());
		arepo.save(a1);
		return a1;
	}
	
}
