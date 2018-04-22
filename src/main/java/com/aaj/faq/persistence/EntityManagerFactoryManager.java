package com.aaj.faq.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryManager {

	private static final String PERSISTENCE_UNIT_NAME = "FaqsPU";
	private static EntityManagerFactory factory;
	
	private EntityManagerFactoryManager() { }
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null)
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		return factory;
	}
	
	public static void close() {
		if (factory != null)
			factory.close();
	}
	
}
