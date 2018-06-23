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
import com.ts.dao.CarGiverDAO;
import com.ts.dto.User;
import com.ts.dto.Cargiver;

/**
* Servlet implementation class userLoginServlet
 */
@WebServlet("/userLoginServlet")
public class userLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		System.out.println(userName);
		
		HttpSession session=request.getSession();
		session.setAttribute("loggedUser", userName);
		
		
		response.setContentType("text/html");
		
		userDAO customerDao = new userDAO();
		User customer=customerDao.getuser(userName, password);
		CarGiverDAO giverDao = new CarGiverDAO();
		Cargiver giver=giverDao.getCarGiver(userName, password);
//		System.out.println("Inside servlet:"+restaurants);
		out.println("<html>");
		if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
			RequestDispatcher dispatcher=request.getRequestDispatcher("adminHomePage.jsp");	
			dispatcher.forward(request, response);
			System.out.println("Success admin");
		}
		else if(customer !=null){
           RequestDispatcher dispatcher=request.getRequestDispatcher("userHomePanel.jsp");	
	dispatcher.forward(request, response);	
			System.out.println("Success User");
		}
		else if(giver !=null) {
			 RequestDispatcher dispatcher=request.getRequestDispatcher("CarGiverHomePanel.jsp");	
				dispatcher.forward(request, response);
			System.out.println("Success giver");
		}
		else{
	out.println("<body bgcolor=yellow text=red> Invalid credentials.!</body>");
RequestDispatcher dispatcher=request.getRequestDispatcher("Hompage.jsp");
	dispatcher.include(request, response);		
		System.out.println("Invalid Credentials");
		}
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
