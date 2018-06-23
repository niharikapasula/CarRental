package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CarGiverDAO;
import com.ts.dto.Cargiver;

@WebServlet("/DisplayGiverServlet")
public class DisplayGiverServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int giverId = Integer.parseInt(request.getParameter("giverId"));
		
		CarGiverDAO carGiverDAO = new CarGiverDAO();
		Cargiver cs = new Cargiver();
		cs = carGiverDAO.getCarGiverById(giverId);
	//	System.out.println("Inside servlet" + cs);
		
		request.setAttribute("Cargiver", cs);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./DisplayGiverDetailsbyId.jsp");
		dispatcher.include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}