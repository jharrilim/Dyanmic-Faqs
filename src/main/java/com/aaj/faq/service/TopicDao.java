package com.aaj.faq.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.RollbackException;

import com.aaj.faq.constants.TopicConstants;
import com.aaj.faq.persistence.EntityManagerFactoryManager;
import com.aaj.faq.pojo.Topic;

public class TopicDao implements Repository<Topic> {
	private static final EntityManager em;

	static {
		em = EntityManagerFactoryManager.getEntityManagerFactory().createEntityManager();
	}

	public Topic last() {
		return (Topic)em.createNamedQuery(TopicConstants.Names.FIND_LAST_TOPIC).getResultList().get(0);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Topic> all() {
		return em.createNamedQuery(TopicConstants.Names.FIND_ALL).getResultList();
	}

	@Override
	public Topic select(int id) {
		return (Topic) em.createNamedQuery(TopicConstants.Names.FIND_BY_ID)
				.setParameter("topicId", id)
				.getResultList()
				.get(0);
	}

	@Override
	public void insert(Topic item) {
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
	public void update(Topic item) {
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
			Topic topic = em.find(Topic.class, id);
			if (topic == null) return;
			et.begin();
			em.remove(topic);
			et.commit();
		} catch(RollbackException e) {
			e.printStackTrace(System.err);
		}
	}
}
