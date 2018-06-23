package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.CarGiverDAO;
import com.ts.dao.userDAO;
import com.ts.dto.Cargiver;
import com.ts.dto.User;

@WebServlet("/CarGiverServlet")
public class CarGiverServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String giverName=request.getParameter("giverName");
		String emailId=request.getParameter("emailId");
		int mobileNo=Integer.parseInt(request.getParameter("mobileNo"));
		
		String password=request.getParameter("password");
		
		Cargiver customer=new Cargiver();
		customer.setgiverName(giverName);
		customer.setemailId(emailId);
		customer.setmobileNo(mobileNo);
		customer.setPassword(password);
		
		System.out.println(customer);
		CarGiverDAO userDAO=new CarGiverDAO();
		if(userDAO.add(customer)!=0){
		
		response.getWriter().println("<h1>Registration Success</h1>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("./CarGiverHomePanel.jsp");
		dispatcher.include(request, response);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
