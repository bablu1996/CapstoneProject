package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entity.Admin;
import com.org.entity.User;
import com.org.entity.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo urepo;
	
	public User addUser(User user)
	{
		return urepo.save(user);
	}
	
	public User updateUser(User user)
	{
		User u=urepo.searchUser(user.getUname());
		u.setUpassword(user.getUpassword());
		urepo.save(u);
		return u;
	}
	
	public List<User> getAllUser() {
		return urepo.findAll();
	}
	
}
