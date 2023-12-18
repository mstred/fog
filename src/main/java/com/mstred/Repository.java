package com.mstred;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Repository
@Transactional
public class Repository<T> {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return (List<T>) em.createQuery("select e from entity e").getResultList();
	}
	
	public void insert(T t) {
		em.persist(t);
	}
}
