package com.cahuata.medicalsearch.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cahuata.medicalsearch.model.entity.Review;

@FeignClient(name = "patientreview-service", fallback = ReviewClientFallback.class)
public interface ReviewClient {
	
	@GetMapping("/review/findByDoctorId/{doctorId}")
	public List<Review> findByDoctorId(@PathVariable("doctorId") Long doctorId);
}
