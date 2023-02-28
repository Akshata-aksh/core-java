package com.xworkz.perfume.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.perfume.entity.PerfumeEntity;
@Repository
public class PerfumeRepositoryImpl implements PerfumeRepository {


	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public PerfumeRepositoryImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(PerfumeEntity entity) {
		
		System.out.println("Running save in repo");
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		 EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
		 manager.persist(entity);
		 transaction.commit();
		 manager.close();
		 return true;
	}
	@Override
	public PerfumeEntity findById(int id) {
		System.out.println("Find by id in repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		PerfumeEntity entity=manager.find(PerfumeEntity.class, id);
		manager.close();
		return entity;

	}
}
