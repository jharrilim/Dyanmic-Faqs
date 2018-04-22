package com.aaj.faq.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaj.faq.pojo.Faq;
import com.aaj.faq.service.FaqDao;

@WebServlet("/Faqs")
public final class ListFaqs extends HttpServlet {
	private static final long serialVersionUID = 2133282937099499326L;

	private final FaqDao faqDao;
	
	public ListFaqs() {
		faqDao = new FaqDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Faq> faqs = faqDao.all();
		request.setAttribute("faqs", faqs);
		request.getRequestDispatcher("/WEB-INF/jsp/faqs.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
