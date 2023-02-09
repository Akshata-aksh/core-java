package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDto;
@Repository
public class BakeryRepositoryImpl implements BakeryRepository {
	
	public BakeryRepositoryImpl() {
	    System.out.println("Running BakeryRepositoryImpl");		
	}

	@Override
	public boolean save(BakeryDto bakeryDto) {
    System.out.println("Running save");		
    return false;
	}

	
}
