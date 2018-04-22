package com.aaj.faq.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaj.faq.pojo.Topic;
import com.aaj.faq.service.TopicDao;

@WebServlet("/Topics")
public class ListTopics extends HttpServlet {

	private static final long serialVersionUID = 4482262344417102270L;

	private final TopicDao topicDao;
	
	public ListTopics() {
		topicDao = new TopicDao();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Topic> topics = topicDao.all();
		request.setAttribute("topics", topics);
		request.getRequestDispatcher("/WEB-INF/jsp/topics.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
