package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDto;
import com.xworkz.egg.repository.EggRepository;


@Service
public class EggServiceImpl implements EggService{
	@Autowired
	private EggRepository eggRepository;
	
	public EggServiceImpl() {
System.out.println("created" + this.getClass().getSimpleName());	}

	@Override
	public boolean validateAndSave(EggDto eggDto) {
	    System.out.println("Running validateAndSave" + eggDto);	
	    boolean save = this.eggRepository.save(eggDto);
	    System.out.println("save "+ save);
		return true;
	}

}
