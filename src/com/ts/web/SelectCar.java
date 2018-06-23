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


@WebServlet("/SelectCar")
public class SelectCar extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int carId = Integer.parseInt(request.getParameter("carId"));
		
		CarDAO carDAO = new CarDAO();
		String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);
		Car cs = new Car();
		cs = carDAO.getCarById(id);
	//	System.out.println("Inside servlet" + cs);
		
		request.setAttribute("Car", cs);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./DisplaySelectCar.jsp");
		dispatcher.include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}