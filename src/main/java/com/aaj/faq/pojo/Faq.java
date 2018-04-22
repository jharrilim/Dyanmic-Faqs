package com.aaj.faq.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import com.aaj.faq.constants.FaqConstants;

@Entity(name = "Faq")
@Table(name = "faq")
@NamedQueries({ @NamedQuery(name = FaqConstants.Names.FIND_ALL, query = FaqConstants.Queries.FIND_ALL),
		@NamedQuery(name = FaqConstants.Names.FIND_BY_ID, query = FaqConstants.Queries.FIND_BY_ID),
		@NamedQuery(name = FaqConstants.Names.FIND_LAST_FAQ, query = FaqConstants.Queries.FIND_LAST_FAQ) })
public class Faq implements Serializable {

	private static final long serialVersionUID = -3997655511679694192L;

	@Id
	private int		topicId;
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
