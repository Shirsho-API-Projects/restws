package com.shirsho.restws.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.shirsho.restws.model.Patient;
import com.shirsho.restws.services.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	Map<Long,Patient> patients= new HashMap<>();
	long currentId =123;
	
	public PatientServiceImpl() {
		init();
		
	}
	void init() {
		Patient patient = new Patient();
		patient.setId(currentId);
		patient.setName("John");
		patients.put(patient.getId(), patient);
		
	}
	

}
