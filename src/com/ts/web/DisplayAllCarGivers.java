package com.ts.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CarGiverDAO;
import com.ts.dto.Cargiver;

@WebServlet("/DisplayAllCarGivers")
public class DisplayAllCarGivers extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	CarGiverDAO dao=new CarGiverDAO();
	
	List<Cargiver> customerList=dao.getAllCarGivers();
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("DisplayAllCarGivers.jsp");
	request.setAttribute("customerList", customerList);
	dispatcher.forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}