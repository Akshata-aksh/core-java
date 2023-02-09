package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDto;
import com.xworkz.bakery.repository.BakeryRepository;
@Service
public class BakeryServiceImpl implements BakeryService {
	@Autowired
	private BakeryRepository bakeryRepository;

	@Override
	public boolean validateAndSave(BakeryDto bakeryDto) {
	    System.out.println("Running vallidateAndSave");	
	    boolean save = bakeryRepository.save(bakeryDto);
	    System.out.println("save "+ save);
		return false;
	}

}
