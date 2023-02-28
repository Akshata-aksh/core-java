package com.xworkz.perfume.repository;

import com.xworkz.perfume.entity.PerfumeEntity;


public interface PerfumeRepository {

	boolean save(PerfumeEntity entity);
	
	default PerfumeEntity findById(int id) {
	return null;
	
}
}
