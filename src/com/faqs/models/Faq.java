package com.faqs.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQueries({ @NamedQuery(name = "Faq.findAll", query = "SELECT f FROM FAQ f"),
		@NamedQuery(name = "Faq.findAFaq", query = "SELECT f FROM FAQ f WHERE f.topicId = :topicId"),
		@NamedQuery(name = "Faq.findLastFaqTopicID", query = "SELECT MAX(f.topicId) FROM FAQ ORDER BY f.topicId DESC") })
public class Faq implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int		topicId;
	private int		questionId;
	private String	question;
	private String	answer;

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
