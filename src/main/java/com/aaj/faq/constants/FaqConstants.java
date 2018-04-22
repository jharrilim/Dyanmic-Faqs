package com.aaj.faq.constants;

public class FaqConstants {
	
	private FaqConstants() { }
	
	public class Names {
		
		public static final String FIND_ALL = "Faq.findAll";
		public static final String FIND_BY_ID = "Faq.findById";
		public static final String FIND_LAST_FAQ = "Faq.findLastFaq";		
		
		private Names() { }
	}
	
	public class Queries {
			
		public static final String FIND_ALL = "SELECT f FROM Faq f";
		public static final String FIND_BY_ID = "SELECT f FROM Faq f WHERE f.topicId = :topicId";
		public static final String FIND_LAST_FAQ = "SELECT MAX(f.topicId) as id FROM Faq f ORDER BY id DESC";
		
		private Queries() { }
	}
}
