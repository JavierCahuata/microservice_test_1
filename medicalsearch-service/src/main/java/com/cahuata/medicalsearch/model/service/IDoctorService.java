package com.cahuata.medicalsearch.model.service;

import java.util.List;
//import java.util.Optional;

import com.cahuata.medicalsearch.model.entity.Doctor;

public interface IDoctorService {
	
	public List<Doctor> findAll();
	
	public Doctor save(Doctor doctor);
	
	public Doctor findById(Long id);
	
	public void delete(Long id);

	public List<Doctor> findByAddressAndSpecialty(String city, String specialty);
}
