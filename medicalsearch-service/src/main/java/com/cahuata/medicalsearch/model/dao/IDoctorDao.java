package com.cahuata.medicalsearch.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cahuata.medicalsearch.model.entity.Doctor;

@Repository
public interface IDoctorDao extends CrudRepository<Doctor, Long>{

	List<Doctor> findByAddressAndSpecialty(String city, String specialty);

}
