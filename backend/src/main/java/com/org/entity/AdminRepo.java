package com.org.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

	@Query(value=("select * from admin where admin.aname= ? and admin.apassword= ?"), nativeQuery = true)
	public Admin findAdmin(String aname, String apassword);
	
	@Query(value=("select * from admin where admin.aname= ? "), nativeQuery = true)
	public Admin searchAdmin(String aname);
	
}
