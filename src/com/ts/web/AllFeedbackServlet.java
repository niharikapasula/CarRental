package com.ts.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.FeedbackDAO;
import com.ts.dto.Feedback;


@WebServlet("/AllFeedbackServlet")
public class AllFeedbackServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		FeedbackDAO dao=new FeedbackDAO();
		
		List<Feedback> customerList=dao.getAllFeedback();
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("DisplayAllFeedback.jsp");
		request.setAttribute("customerList", customerList);
		dispatcher.forward(request, response);	
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}
	}