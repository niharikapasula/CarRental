package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ts.dao.userDAO;
import com.ts.dto.User;

@WebServlet("/DisplayUserIdServlet")
public class DisplayUserIdServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		userDAO userDAO = new userDAO();
		User cs = new User();
		cs = userDAO.getUserById(userId);
	//	System.out.println("Inside servlet" + cs);
		
		request.setAttribute("User", cs);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./DisplayDetailsByUserId.jsp");
		dispatcher.include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}