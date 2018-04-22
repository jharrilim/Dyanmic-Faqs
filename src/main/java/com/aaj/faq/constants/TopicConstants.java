package com.aaj.faq.constants;

public class TopicConstants {
	
	private TopicConstants() { }
	
	public class Names {
		
		private Names() { }
		
		public static final String FIND_ALL = "Topic.findAll";
		public static final String FIND_BY_ID = "Topic.findById";
		public static final String FIND_LAST_TOPIC = "Topic.findLastTopic";		
	}
	
	public class Queries {
		
		private Queries() { }
		
		public static final String FIND_ALL = "SELECT t FROM TOPIC t";
		public static final String FIND_BY_ID = "SELECT t FROM TOPIC t WHERE t.topicId = :topicId";
		public static final String FIND_LAST_TOPIC = "SELECT MAX(t.topicId) FROM TOPIC ORDER BY t.topicId DESC";
	}
}
