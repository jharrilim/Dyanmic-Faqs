package com.aaj.faq.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Topic")
@Table(name="topics")
@NamedQueries({ @NamedQuery(name = "Topic.findAll", query = "SELECT t FROM Topic t"),
		@NamedQuery(name = "Topic.findATopic", query = "SELECT t FROM Topic t WHERE t.topicId = :topicId"),
		@NamedQuery(name = "Topic.findLastTopicID", query = "SELECT MAX(t.topicId) as id FROM Topic t ORDER BY id DESC") })
public class Topic implements Serializable {

	private static final long serialVersionUID = 2165660184640081105L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int		topicId;
	private String	topicName;
	@OneToMany(
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	
	private List<Faq> faqs = new ArrayList<>();
	
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

	public List<Faq> getFaqs() {
		return faqs;
	}

	public void setFaqs(List<Faq> faqs) {
		this.faqs = faqs;
	}

}
