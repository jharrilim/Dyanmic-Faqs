package com.faqs.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


public class TopicId implements Serializable {
	private int topicId;
	private int questionId;
	public int getTopicId() {
		return topicId;
	}

	public int getQuestionId() {
		return questionId;
	}

}
