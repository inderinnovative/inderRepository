package com.inder.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inder.spring.dao.MedicineDao;
import com.inder.spring.model.Medicine;

public class HomeService {

	@Autowired 
	 MedicineDao medicineDao;
	
	public List<Medicine> getAllRecord(){
		return medicineDao.findAllMedicine();
	}
	
	public List<Medicine> getRecordFromPattern(String pattern){
		return medicineDao.findAllMedicineFromPattern(pattern);
	}
}
