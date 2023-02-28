package com.xworkz.perfume.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.perfume.entity.PerfumeEntity;


public interface PerfumeRepository {

	boolean save(PerfumeEntity entity);
	
	default PerfumeEntity findById(int id) {
	return null;
	
}
	default List<PerfumeEntity> findByCompany(String company){
		return  Collections.emptyList();
	}
}
