package com.ts.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dbutility.DBConnection;
import com.ts.dto.Feedback;
import com.ts.dto.User;


@WebServlet("/FeedbackDAO")

	public class FeedbackDAO {
		
		
		public int add(Feedback customer){
			final String INSERT_QUERY="insert into feedback(userId,carId,feedback) values(?,?,?)";
			PreparedStatement pst = null;
			
			int status=0;
			
			try(Connection con=DBConnection.getConnection();) {
				pst=con.prepareStatement(INSERT_QUERY);
				
				pst.setInt(1, customer.getuserId());
				
				pst.setInt(2, customer.getcarId());
				pst.setString(3, customer.getfeedback());
				
				status=pst.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return status;
		}
		public List<Feedback> getAllFeedback(){
			List<Feedback> list=new ArrayList<>();
			
			PreparedStatement pst = null;
			ResultSet rst = null;
		final String SELECT_QUERY = "select * from feedback ";
		try(Connection con = DBConnection.getConnection();){
			pst = con.prepareStatement(SELECT_QUERY);
			rst = pst.executeQuery();
			while(rst.next()){
				Feedback customer=new Feedback();
				customer.setuserId(rst.getInt(1));
				customer.setcarId(rst.getInt(2));
				customer.setfeedback(rst.getString(3));
				
				list.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		}
		}