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

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("userName");
		String emailId=request.getParameter("emailId");
		int mobileNo=Integer.parseInt(request.getParameter("mobileNo"));
		
		String password=request.getParameter("password");
		
		User customer=new User();
		customer.setuserName(userName);
		customer.setemailId(emailId);
		customer.setmobileNo(mobileNo);
		customer.setPassword(password);
		
		System.out.println(customer);
		userDAO userDAO=new userDAO();
		if(userDAO.add(customer)!=0){
		
		response.getWriter().println("<h1>Registration Success</h1>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("./userHomePanel.jsp");
		dispatcher.include(request, response);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
