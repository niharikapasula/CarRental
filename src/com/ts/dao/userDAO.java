package com.ts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dbutility.DBConnection;
import com.ts.dto.User;

public class userDAO {
	
	
	public   int add(User customer){
		final String INSERT_QUERY="insert into User(userName,emailId,mobileNo,password) values(?,?,?,?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try(Connection con=DBConnection.getConnection();) {
			pst=con.prepareStatement(INSERT_QUERY);
			pst.setString(1, customer.getuserName());
			pst.setString(2, customer.getemailId());
			pst.setInt(3, customer.getmobileNo());
			pst.setString(4, customer.getPassword());
			
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
public User getProfile(String userName){
		
		PreparedStatement pst = null;
		ResultSet rst = null;
		User customer=null;
	final String SELECT_QUERY = "select * from customer where userName = ?";
	try(Connection con = DBConnection.getConnection();){
		
		pst = con.prepareStatement(SELECT_QUERY);
		pst.setString(1, userName);
		rst = pst.executeQuery();
		if(rst.next()){
			 customer=new User();
			 customer.setuserId(rst.getInt(1));
			 customer.setuserName(rst.getString(2));
			 customer.setemailId(rst.getString(3));
			 customer.setmobileNo(rst.getInt(4));
			 customer.setPassword(rst.getString(5));
		System.out.println(customer);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return customer;
	}	

public User getUserById(int userId){
	
	PreparedStatement pst = null;
	ResultSet rst = null;
	User customer=null;
final String SELECT_QUERY = "select * from user where userId = ?";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, userId);
	rst = pst.executeQuery();
	if(rst.next()){
		 customer=new User();
		 customer.setuserId(rst.getInt(1));
		 customer.setuserName(rst.getString(2));
		 customer.setemailId(rst.getString(3));
		 customer.setmobileNo(rst.getInt(4));
		 customer.setPassword(rst.getString(5));
	System.out.println(customer);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return customer;
}	
	
public int deleteUser(int userId){
	
	PreparedStatement pst = null;
	int status = 0;
final String SELECT_QUERY = "delete from user where userId = ?";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, userId);
	status = pst.executeUpdate();
	
	System.out.println(status);
} catch (SQLException e) {
	e.printStackTrace();
}
System.out.println(status);
return status;
}	

public int update(User customer){
	final String INSERT_QUERY="update user set userName =?,emailId =? ,mobileNo=?,password=? where userId =?";
	PreparedStatement pst = null;
	
	int status=0;
	
	try(Connection con=DBConnection.getConnection();) {
		pst=con.prepareStatement(INSERT_QUERY);
		pst.setString(1, customer.getuserName());
		pst.setString(2, customer.getemailId());
		pst.setInt(3, customer.getmobileNo());
		
		pst.setString(4, customer.getPassword());
		pst.setInt(5, customer.getuserId());
		
		status=pst.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}
public User getuser(String userName,String password){
	
	PreparedStatement pst = null;
	ResultSet rst = null;
	User customer=null;
final String SELECT_QUERY = "select * from user where userName = ? and password = ?";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setString(1, userName);
	pst.setString(2, password);
	rst = pst.executeQuery();
	if(rst.next()){
		 customer=new User();
		 customer.setuserId(rst.getInt(1));
		 customer.setuserName(rst.getString(2));
		 customer.setemailId(rst.getString(3));
		 customer.setmobileNo(rst.getInt(4));
		 
		 customer.setPassword(rst.getString(5));
	System.out.println(customer);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return customer;
}

public List<User> getAllUsers(){
	List<User> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from user ";
try(Connection con = DBConnection.getConnection();){
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		User customer=new User();
		customer.setuserId(rst.getInt(1));
		customer.setuserName(rst.getString(2));
		customer.setemailId(rst.getString(3));
		customer.setmobileNo(rst.getInt(4));
		customer.setPassword(rst.getString(5));
		list.add(customer);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return list;
}
}