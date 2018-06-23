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
import com.ts.dto.Cargiver;

public class CarGiverDAO {
	
	
	public static int add(Cargiver customer){
		final String INSERT_QUERY="insert into cargiver(giverName,emailId,mobileNo,password) values(?,?,?,?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try(Connection con=DBConnection.getConnection();) {
			pst=con.prepareStatement(INSERT_QUERY);
			pst.setString(1, customer.getgiverName());
			pst.setString(2, customer.getemailId());
			pst.setInt(3, customer.getmobileNo());
			pst.setString(4, customer.getPassword());
			
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
public Cargiver getProfile(String giverName){
		
		PreparedStatement pst = null;
		ResultSet rst = null;
		Cargiver customer=null;
	final String SELECT_QUERY = "select * from carGiver where giverName = ?";
	try(Connection con = DBConnection.getConnection();){
		
		pst = con.prepareStatement(SELECT_QUERY);
		pst.setString(1, giverName);
		rst = pst.executeQuery();
		if(rst.next()){
			 customer=new Cargiver();
			 customer.setgiverId(rst.getInt(1));
			 customer.setgiverName(rst.getString(2));
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

public Cargiver getCarGiverById(int giverId){
	
	PreparedStatement pst = null;
	ResultSet rst = null;
	Cargiver customer=null;
final String SELECT_QUERY = "select * from carGiver where giverId = ?";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, giverId);
	rst = pst.executeQuery();
	if(rst.next()){
		 customer=new Cargiver();
		 customer.setgiverId(rst.getInt(1));
		 customer.setgiverName(rst.getString(2));
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
	
public int deleteCarGiver(int giverId){
	
	PreparedStatement pst = null;
	int status = 0;
final String SELECT_QUERY = "delete from carGiver where giverId = ?";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, giverId);
	status = pst.executeUpdate();
	
	System.out.println(status);
} catch (SQLException e) {
	e.printStackTrace();
}
System.out.println(status);
return status;
}	

public int update(Cargiver customer){
	final String INSERT_QUERY="update cargiver set giverName =?,emailId =? ,mobileNo=?,password=? where custId =?";
	PreparedStatement pst = null;
	
	int status=0;
	
	try(Connection con=DBConnection.getConnection();) {
		pst=con.prepareStatement(INSERT_QUERY);
		pst.setString(1, customer.getgiverName());
		pst.setString(2, customer.getemailId());
		pst.setInt(3, customer.getmobileNo());
		
		pst.setString(4, customer.getPassword());
		pst.setInt(5, customer.getgiverId());
		
		status=pst.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}
public static Cargiver getCarGiver(String giverName,String password){
	
	PreparedStatement pst = null;
	ResultSet rst = null;
	Cargiver customer=null;
final String SELECT_QUERY = "select * from carGiver where giverName = ? and password = ?";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setString(1, giverName);
	pst.setString(2, password);
	rst = pst.executeQuery();
	if(rst.next()){
		 customer=new Cargiver();
		 customer.setgiverId(rst.getInt(1));
		 customer.setgiverName(rst.getString(2));
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

public List<Cargiver> getAllCarGivers(){
	List<Cargiver> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from carGiver ";
try(Connection con = DBConnection.getConnection();){
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		Cargiver customer=new Cargiver();
		customer.setgiverId(rst.getInt(1));
		customer.setgiverName(rst.getString(2));
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