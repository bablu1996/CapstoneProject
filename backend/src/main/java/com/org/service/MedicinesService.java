package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entity.Medicines;
import com.org.entity.MedicinesRepo;

@Service
public class MedicinesService {

	@Autowired
	MedicinesRepo mrepo;
	
	public Medicines addMedicine(Medicines medicines)
	{
		return mrepo.save(medicines);
	}
	
	public List<Medicines> getAllMedicines() {
		return mrepo.findAll();
	}
	
	public List<Medicines> getAllMedicinesEnabled() {
		return mrepo.searchMedsEnabled();
	}
	
	public List<Medicines> getAllMedicinesbyCat()
	{
		return mrepo.MedsbyCat();
	}
	
	public List<Medicines> getAllMedicinesbyPrice()
	{
		return mrepo.MedsbyPrice();
	}
	
	public List<Medicines> getAllMedicinesbyDate()
	{
		return mrepo.MedsbyDate();
	}
	
	public Medicines editMed(Medicines medicines)
	{
		Medicines m=mrepo.getById(medicines.getMid());
		m.setMname(medicines.getMname());
		m.setMprice(medicines.getMprice());
		m.setMdesc(medicines.getMdesc());
		m.setMcategory(medicines.getMcategory());
		m.setExpiredate(medicines.getExpiredate());
		m.setMcontrol(medicines.getMcontrol());
		mrepo.save(m);
		return m;
	}
	
	public List<Medicines> searchforMeds(Medicines medicines)
	{
		return mrepo.searchMeds(medicines.getMname());
	}
	
	public Medicines enableMed(Medicines medicines)
	{
		Medicines m=mrepo.getById(medicines.getMid());
		m.setMcontrol(1);
		mrepo.save(m);
		return m;
	}
	
	public Medicines disableMed(Medicines medicines)
	{
		Medicines m=mrepo.getById(medicines.getMid());
		m.setMcontrol(0);
		mrepo.save(m);
		return m;
	}
	
	public void deleteMed(Medicines medicines)
	{
		mrepo.deleteById(medicines.getMid());
	}
	
}
