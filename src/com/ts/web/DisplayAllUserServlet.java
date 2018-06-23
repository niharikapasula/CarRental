package com.ts.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ts.dao.userDAO;
import com.ts.dto.User;

@WebServlet("/DisplayAllUserServlet")
public class DisplayAllUserServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	userDAO dao=new userDAO();
	
	List<User> customerList=dao.getAllUsers();
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("DisplayAllUsers.jsp");
	request.setAttribute("customerList", customerList);
	dispatcher.forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
