package com.aaj.faq.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;

import com.aaj.faq.pojo.TopicId;

import javax.persistence.NamedQueries;

@Entity
@NamedQueries({ @NamedQuery(name = "Faq.findAll", query = "SELECT f FROM FAQ f"),
		@NamedQuery(name = "Faq.findAFaq", query = "SELECT f FROM FAQ f WHERE f.topicId = :topicId"),
		@NamedQuery(name = "Faq.findLastFaqTopicID", query = "SELECT MAX(f.topicId) FROM FAQ ORDER BY f.topicId DESC") })
@IdClass(TopicId.class)
public class Faq implements Serializable {

	private static final long serialVersionUID = -3997655511679694192L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int		topicId;
	@Id
	private int		questionId;
	private String	question;
	private String	answer;

	public int getTopicId() {
		return topicId;
	}

	public Faq setTopicId(int topicId) {
		this.topicId = topicId;
		return this;
	}

	public int getQuestionId() {
		return questionId;
	}

	public Faq setQuestionId(int questionId) {
		this.questionId = questionId;
		return this;
	}

	public String getQuestion() {
		return question;
	}

	public Faq setQuestion(String question) {
		this.question = question;
		return this;
	}

	public String getAnswer() {
		return answer;
	}

	public Faq setAnswer(String answer) {
		this.answer = answer;
		return this;
	}
}
