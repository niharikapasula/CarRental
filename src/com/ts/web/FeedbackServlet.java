package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ts.dao.FeedbackDAO;
import com.ts.dao.userDAO;
import com.ts.dto.Feedback;
import com.ts.dto.User;

/**
 * Servlet implementation class FeedbackServlet
 */
@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int userId=Integer.parseInt(request.getParameter("userId"));
		int carId=Integer.parseInt(request.getParameter("carId"));
		String feedback=request.getParameter("feedback");
		
		Feedback customer=new Feedback();
		customer.setuserId(userId);
		customer.setcarId(carId);
		customer.setfeedback(feedback);
		
		System.out.println(customer);
		FeedbackDAO userDAO=new FeedbackDAO();
		if(userDAO.add(customer)!=0){
		
		response.getWriter().println("<h1>Feedback Successful</h1>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("./userHomePanel.jsp");
		dispatcher.include(request, response);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
