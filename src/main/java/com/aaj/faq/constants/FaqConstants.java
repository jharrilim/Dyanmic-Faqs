package com.aaj.faq.constants;

public class FaqConstants {
	
	public class Names {
		public static final String FIND_ALL = "Faq.findAll";
		public static final String FIND_BY_ID = "Faq.findById";
		public static final String FIND_LAST_FAQ = "Faq.findLastFaq";		
	}
	
	public class Queries {
		public static final String FIND_ALL = "SELECT f FROM FAQ f";
		public static final String FIND_BY_ID = "SELECT f FROM FAQ f WHERE f.topicId = :topicId";
		public static final String FIND_LAST_FAQ = "SELECT MAX(f.topicId) FROM FAQ ORDER BY f.topicId DESC";
	}
}
