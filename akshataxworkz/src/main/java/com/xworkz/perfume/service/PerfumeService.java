package com.xworkz.perfume.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.perfume.dto.PerfumeDto;

public interface PerfumeService {
	
	Set<ConstraintViolation<PerfumeDto>> validateAndSave(PerfumeDto dto);
	
    default PerfumeDto findById(int id) {
    	return null;
    }
}
