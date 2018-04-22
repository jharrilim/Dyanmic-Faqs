package com.aaj.faq.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.RollbackException;
import javax.persistence.TransactionRequiredException;

import com.aaj.faq.pojo.Faq;
import com.aaj.faq.persistence.EntityManagerFactoryManager;
import com.aaj.faq.constants.FaqConstants;

public class FaqDao implements Repository<Faq> {

	private static final EntityManager em;

	static {
		em = EntityManagerFactoryManager.getEntityManagerFactory().createEntityManager();
	}

	public FaqDao() {
		
	}
	
	public Faq last() {
		return (Faq)em.createNamedQuery(FaqConstants.Names.FIND_LAST_FAQ).getResultList().get(0);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Faq> all() {
		return em.createNamedQuery(FaqConstants.Names.FIND_ALL).getResultList();
	}

	@Override
	public Faq select(int id) {
		return (Faq) em.createNamedQuery(FaqConstants.Names.FIND_BY_ID)
				.setParameter("topicId", id)
				.getResultList()
				.get(0);
	}

	@Override
	public void insert(Faq item) {
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(item);
			et.commit();
		} catch(RollbackException e) {
			e.printStackTrace(System.err);
		}

	}

	@Override
	public void update(Faq item) {
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.merge(item);
			et.commit();
		} catch(RollbackException e) {
			e.printStackTrace(System.err);
		}
	}

	@Override
	public void delete(int id) {
		try {
			EntityTransaction et = em.getTransaction();
			Faq faq = em.find(Faq.class, id);
			if (faq == null) return;
			et.begin();
			em.remove(faq);
			et.commit();
		} catch(RollbackException e) {
			e.printStackTrace(System.err);
		}
	}
	
}
