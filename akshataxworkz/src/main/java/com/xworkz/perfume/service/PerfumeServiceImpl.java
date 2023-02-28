package com.xworkz.perfume.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.perfume.dto.PerfumeDto;
import com.xworkz.perfume.entity.PerfumeEntity;
import com.xworkz.perfume.repository.PerfumeRepository;

@Service
public class PerfumeServiceImpl implements PerfumeService {
 
	@Autowired
	private PerfumeRepository perfumeRepository;
	
	public PerfumeServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
}
	
	@Override
	public Set<ConstraintViolation<PerfumeDto>> validateAndSave(PerfumeDto dto){
		System.out.println("Running validateAndSave in service");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator  validator =factory.getValidator();
        Set<ConstraintViolation<PerfumeDto>> violations=validator.validate(dto);
        if(violations != null && !violations.isEmpty()) {
			System.out.println("Violations in dto"+dto);
			return violations;
		}else {
			System.out.println("There is no violations, can save");
      PerfumeEntity entity=new PerfumeEntity();
      entity.setCompany(dto.getCompany());
      entity.setCost(dto.getCost());
      entity.setCountry(dto.getCountry());
      entity.setName(dto.getName());
      entity.setType(dto.getType());
      boolean saved=this.perfumeRepository.save(entity);
      System.out.println(saved);
      return Collections.emptySet();
	}
	}
	@Override
	public PerfumeDto findById(int id) {
		if(id>0) {
			PerfumeEntity entity=this.perfumeRepository.findById(id);
			if(entity !=null) {
				PerfumeDto dto=new PerfumeDto();
				dto.setId(entity.getId());
				dto.setCompany(entity.getCompany());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				dto.setName(entity.getName());
				dto.setType(entity.getType());
			
			return dto;
		}
		}
		return PerfumeService.super.findById(id);
	}
		@Override
		public List<PerfumeDto> findByCompany(String company){
			System.out.println("running findByCompany in service"+company);
			
			if(company !=null && !company.isEmpty()) {
				System.out.println("company is valid calling repo");
				List<PerfumeEntity> entities=this.perfumeRepository.findByCompany(company);
				
				//list<E> --> list<D>
				List<PerfumeDto> listOfDto=new ArrayList<PerfumeDto>();
				for(PerfumeEntity entity : entities) {
					PerfumeDto dto=new PerfumeDto();
					dto.setCompany(entity.getCompany());
					dto.setCost(entity.getCost());
					dto.setCountry(entity.getCountry());
					dto.setName(entity.getName());
					dto.setType(entity.getType());
					dto.setId(entity.getId());
					listOfDto.add(dto);
					
				}
				System.out.println("size of dtos"+listOfDto.size());
				System.out.println("size of dtos"+entities.size());
               return listOfDto;
			}
			else {
				System.err.println("company is invalid");
			}
			
		
		return PerfumeService.super.findByCompany(company);
		
			}
		}


