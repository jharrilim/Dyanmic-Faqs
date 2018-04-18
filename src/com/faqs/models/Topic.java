package com.faqs.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@IdClass(TopicId.class)
@Entity
@NamedQueries({ @NamedQuery(name = "Topic.findAll", query = "SELECT s FROM Student s"),
		@NamedQuery(name = "Topic.findATopic", query = "SELECT s FROM Student s WHERE s.stdid = :stdid"),
		@NamedQuery(name = "Faq.findLastTopicTopicID", query = "SELECT MAX(s.stdid) FROM Student s ORDER BY s.stdid DESC") })
public class Topic implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int topicId;
	@Id
	private String topicName;
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
}
