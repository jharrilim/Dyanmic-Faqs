package com.aaj.faq.service;

import java.util.List;

public interface Repository<T> {

	List<T> all();
	
	T select(int id);
	
	void insert(T item);
	
	void update(T item);
	
	void delete(int id);
}