package com.xworkz.egg.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.EggDto;


@Repository
public class EggRepositoryImpl implements EggRepository  {

	public EggRepositoryImpl() {
System.out.println("Running EggRepositoryImpl");
}
	
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
@Override
	public boolean save(EggDto eggDto) {
		
		System.out.println("Running save");	
		   EntityManager entityMananger= this.entityManagerFactory.createEntityManager(); 
		   EntityTransaction transaction = entityMananger.getTransaction();
		   transaction.begin();
		   entityMananger.persist(eggDto);
		   transaction.commit();
		   entityMananger.close();
		   return false;
				}

}
