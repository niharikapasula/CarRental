package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CarDAO;
import com.ts.dto.Car;


@WebServlet("/AddCarByAdmin")
public class AddCarByAdmin extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		String carModel=request.getParameter("carModel");
		int seats=Integer.parseInt(request.getParameter("seats"));
		int rentPerDay= Integer.parseInt(request.getParameter("rentPerDay"));
		String driverName=request.getParameter("driverName");
		int driverMobileNo=Integer.parseInt(request.getParameter("driverMobileNo"));
		int giverId=Integer.parseInt(request.getParameter("giverId"));
		
		Car customer=new Car();
		customer.setcarModel(carModel);
		customer.setseats(seats);
		customer.setrentPerDay(rentPerDay);
		customer.setdriverName(driverName);
		customer.setdriverMobileNo(driverMobileNo);
		customer.setgiverId(giverId);
		
		System.out.println(customer);
		CarDAO customerDAO=new CarDAO();
		if(customerDAO.add(customer)!=0){
		
		response.getWriter().println("<h1>Registration Success</h1>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("./adminHomePage.jsp");
		dispatcher.include(request, response);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
