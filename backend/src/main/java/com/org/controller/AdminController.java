package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entity.Admin;
import com.org.service.AdminService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/medicare")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin/insert")
	public Admin addNewAdmin(@RequestBody Admin admin)
	{
		return adminService.addAdmin(admin);
	}
	
	@GetMapping("/admin/list")
	public List<Admin> listAdmin()
	{
		return adminService.getAllAdmin();
	}
	
	@PutMapping("/admin/updatepwd")
	public Admin updatePwd(@RequestBody Admin admin)
	{
		return adminService.updateAdmin(admin);
	}
	
}
