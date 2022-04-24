package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entity.Admin;
import com.org.entity.User;
import com.org.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/medicare")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user/insert")
	public User addNewUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@GetMapping("/user/list")
	public List<User> listUser()
	{
		return userService.getAllUser();
	}
	
	@PutMapping("/user/updatepwd")
	public User updatePwd(@RequestBody User user)
	{
		return userService.updateUser(user);
	}
	
}
