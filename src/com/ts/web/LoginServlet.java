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

import com.ts.dao.userDAO;
import com.ts.dto.User;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		HttpSession session=request.getSession();
		session.setAttribute("loggedUser", userName);
		
		
		response.setContentType("text/html");
		
		userDAO userDAO = new userDAO();
		User user=userDAO.getuser(userName, password);
		System.out.println("Inside servlet:"+user);
		out.println("<html>");
		if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
RequestDispatcher dispatcher=request.getRequestDispatcher("adminHomePage.jsp");	
	dispatcher.forward(request, response);
		}else if(user !=null){
RequestDispatcher dispatcher=request.getRequestDispatcher("userHomePanel.jsp");	
		dispatcher.forward(request, response);			
		}
		else{
	out.println("<body bgcolor=yellow text=red> Invalid credentials.!</body>");
RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
		dispatcher.include(request, response);		
		}
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
}