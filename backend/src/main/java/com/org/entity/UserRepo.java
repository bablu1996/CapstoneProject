package com.org.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value=("select * from user where user.uname= ? and user.upassword= ? "), nativeQuery = true)
	public User findUser(String uname, String upassword);
	
	@Query(value=("select * from user where user.uname= ? "), nativeQuery = true)
	public User searchUser(String uname);
	
}
