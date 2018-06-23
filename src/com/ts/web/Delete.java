package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.userDAO;
import com.ts.dto.User;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub9                                                                                                                                 \ kll
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		userDAO dao = new userDAO();
		String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        if(id != 0){
        	
        	int customer=dao.deleteUser(id);
        	System.out.println("Inside servlet:"+ id);
        	RequestDispatcher dispatcher=request.getRequestDispatcher("./DisplayAllUserServlet");
    		dispatcher.include(request, response);	
        }
	}
}

