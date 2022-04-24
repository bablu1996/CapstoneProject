package com.org.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinesRepo extends JpaRepository<Medicines, Integer> {

	@Query(value=("select * from medicines order by medicines.mcategory"), nativeQuery = true)
	public List<Medicines> MedsbyCat();
	
	@Query(value=("select * from medicines order by medicines.mprice"), nativeQuery = true)
	public List<Medicines> MedsbyPrice();
	
	@Query(value=("select * from medicines order by medicines.expiredate"), nativeQuery = true)
	public List<Medicines> MedsbyDate();
	
	@Query(value=("select * from medicines where medicines.mname= ? and medicines.mcontrol= 1"), nativeQuery = true)
	public List<Medicines> searchMeds(String mname);
	
	@Query(value=("select * from medicines where medicines.mname= ? order by medicines.mcategory"), nativeQuery = true)
	public List<Medicines> searchMedsByCat(String mname);
	
	@Query(value=("select * from medicines where medicines.mname= ? order by medicines.mprice"), nativeQuery = true)
	public List<Medicines> searchMedsByPrice(String mname);
	
	@Query(value=("select * from medicines where medicines.mname= ? order by medicines.expiredate"), nativeQuery = true)
	public List<Medicines> searchMedsByDate(String mname);
	
	@Query(value=("select * from medicines where medicines.mcontrol= 1 "), nativeQuery = true)
	public List<Medicines> searchMedsEnabled();
	
}
