package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.CarGiverDAO;


@WebServlet("/DeleteCarGiver")
public class DeleteCarGiver extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub9                                                                                                                                 \ kll
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		CarGiverDAO dao = new CarGiverDAO();
		String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        if(id != 0){
        	int customer=dao.deleteCarGiver(id);
        	System.out.println("Inside servlet:"+ id);
        	RequestDispatcher dispatcher=request.getRequestDispatcher("./DisplayAllCarGivers");
    		dispatcher.include(request, response);	
        }
	}
}