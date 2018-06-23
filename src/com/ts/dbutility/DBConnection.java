package com.ts.dbutility;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.el.parser.ParseException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bvrit","root","root");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
		
//		public  java.util.Date readDateFromDatabase(java.sql.Date transactionDate) {
//	        Connection con = null;
//	        java.sql.Date dateFromDatabse = null;
//	        try {
//	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	            String url = "jdbc:sqlserver://localhost:42588;";
//	            DriverManager.setLogWriter(new PrintWriter(System.out, true));
//	            con = DriverManager.getConnection(url, "root", "root");
//
//	            PreparedStatement ps = con.prepareStatement("select GETDATE()");
//	            ResultSet rs = ps.executeQuery();
//
//	            rs.next(); // move the cursor to first column
//	            dateFromDatabse = rs.getDate(1);
//
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        return dateFromDatabse;
//	    }

//	public class DateFormat{
//		String date=request.getParameter("date");
//		java.text.SimpleDateFormat sdf= new java.text.SimpleDateFormat("yyyy-MM-dd");
//		java.util.Date utilDate = null;
//		try{
//			utilDate=sdf.parse(date);
//		}
//		catch(ParseException e){
//			e.printStackTrace();
//		}
//	}
//}
}