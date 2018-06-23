package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CarDAO;

@WebServlet("/DeleteCar")
public class DeleteCar extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub9                                                                                                                                 \ kll
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		CarDAO dao = new CarDAO();
		String sid=request.getParameter("Id");  
        int id=Integer.parseInt(sid);  
        if(id != 0){
        	int customer=dao.deleteCar(id);
        	System.out.println("Inside servlet:"+ id);
        	RequestDispatcher dispatcher=request.getRequestDispatcher("./SuccessfullyBooked.jsp");
    		dispatcher.include(request, response);	
        }
	}
}