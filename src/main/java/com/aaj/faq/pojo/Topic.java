package com.aaj.faq.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Topic.findAll", query = "SELECT s FROM Student s"),
		@NamedQuery(name = "Topic.findATopic", query = "SELECT s FROM Student s WHERE s.stdid = :stdid"),
		@NamedQuery(name = "Faq.findLastTopicTopicID", query = "SELECT MAX(s.stdid) FROM Student s ORDER BY s.stdid DESC") })
public class Topic implements Serializable {

	private static final long serialVersionUID = 2165660184640081105L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int		topicId;
	private String	topicName;

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
