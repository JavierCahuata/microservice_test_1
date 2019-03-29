package com.cahuata.patientreview.controller;

import java.util.List;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cahuata.patientreview.model.entity.Review;
import com.cahuata.patientreview.model.service.IReviewService;

@CrossOrigin(origins = { "http://localhost:4200", "*" })
@RestController
public class ReviewController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReviewController.class);

	@Autowired
	IReviewService repository;
	
	@PostMapping("/review/save")
	public Review add(@RequestBody Review review) {
		LOGGER.info("Review add : {}", review);
		return repository.save(review);
	}
	
	@GetMapping("/review/find/{id}")
	public Optional<Review> findById(@PathVariable("id") Long id) {
		LOGGER.info("Employee find: id={}", id);
		return repository.findById(id);
	}
	
	@GetMapping("/review/list")
	public List<Review> findAll() {
		LOGGER.info("Review find");
		return repository.findAll();
	}
	
	@GetMapping("/review/findByDoctorId/{doctorId}")
	public List<Review> findByDoctorId(@PathVariable("doctorId") Long doctorId) {
		LOGGER.info("Review find: doctorId={}", doctorId);
		return repository.findByDoctorId(doctorId);
	}
	
	@GetMapping("/review/findByPatientDni/{patientDni}")
	public List<Review> findByPatientDni(@PathVariable("patientDni") String patientDni) {
		LOGGER.info("Review find: patientDni={}", patientDni);
		return repository.findByPatientDni(patientDni);
	}
}
