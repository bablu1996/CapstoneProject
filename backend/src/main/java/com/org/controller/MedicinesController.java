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

import com.org.entity.Medicines;
import com.org.service.MedicinesService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/medicare")
public class MedicinesController {

	@Autowired
	MedicinesService medicinesService;
	
	@PostMapping("/medicines/insert")
	public Medicines addNewMedicine(@RequestBody Medicines medicines)
	{
		return medicinesService.addMedicine(medicines);
	}
	
	@GetMapping("/medicines/list")
	public List<Medicines> listMedicines()
	{
		return medicinesService.getAllMedicines();
	}
	
	@GetMapping("/medicines/list/enable")
	public List<Medicines> listMedicinesEnabled()
	{
		return medicinesService.getAllMedicinesEnabled();
	}
	
	@GetMapping("/medicines/list/category")
	public List<Medicines> listMedicinesbyCat()
	{
		return medicinesService.getAllMedicinesbyCat();
	}
	
	@GetMapping("/medicines/list/price")
	public List<Medicines> listMedicinesbyPrice()
	{
		return medicinesService.getAllMedicinesbyPrice();
	}
	
	@GetMapping("/medicines/list/date")
	public List<Medicines> listMedicinesbyDate()
	{
		return medicinesService.getAllMedicinesbyDate();
	}
	
	@PutMapping("/medicines/edit")
	public Medicines editMedicines(@RequestBody Medicines medicines)
	{
		return medicinesService.editMed(medicines);
	}
	
	@PutMapping("/medicines/search")
	public List<Medicines> searchMedicines(@RequestBody Medicines medicines)
	{
		return medicinesService.searchforMeds(medicines);
	}
	
	@PutMapping("/medicines/enable")
	public Medicines enableMedicine(@RequestBody Medicines medicines)
	{
		return medicinesService.enableMed(medicines);
	}
	
	@PutMapping("/medicines/disable")
	public Medicines disableMedicine(@RequestBody Medicines medicines)
	{
		return medicinesService.disableMed(medicines);
	}
	
	@PutMapping("/medicines/delete")
	public void deleteMedicine(@RequestBody Medicines medicines)
	{
		medicinesService.deleteMed(medicines);
		System.out.println("Medicine Deleted");
	}
	
}
