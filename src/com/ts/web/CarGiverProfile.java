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
import com.ts.dto.Cargiver;

@WebServlet("/CarGiverProfile")
public class CarGiverProfile extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String giverName;
		String password;
		HttpSession session=request.getSession();
		giverName = (String)session.getAttribute("loggedUser");
		password = (String)session.getAttribute("password");
		
		PrintWriter out = response.getWriter();
		CarGiverDAO customerDAO = new CarGiverDAO();
		 Cargiver cs = new Cargiver();
		cs = customerDAO.getCarGiver(giverName, password);
		
		request.setAttribute("customer", cs);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./DisplayCarGiverProfile.jsp");
		dispatcher.include(request, response);
//		out.println(cs);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
