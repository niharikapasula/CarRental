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
import com.ts.dto.Car;
import com.ts.dto.User;

public class CarDAO {
	
	
	public int add(Car customer){
		final String INSERT_QUERY="insert into car(carModel,seats,rentPerDay,driverName,driverMobileNo,giverId) values(?,?,?,?,?,?)";
		PreparedStatement pst = null;
		
		int status=0;
		
		try(Connection con=DBConnection.getConnection();) {
			pst=con.prepareStatement(INSERT_QUERY);
			pst.setString(1, customer.getcarModel());
			pst.setInt(2, customer.getseats());
			pst.setDouble(3, customer.getrentPerDay());
			pst.setString(4, customer.getdriverName());
			pst.setInt(5, customer.getdriverMobileNo());
			pst.setInt(6, customer.getgiverId());
			
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	


//public static Car getCarBySeats(int seats){
//	
//	PreparedStatement pst = null;
//	ResultSet rst = null;
//	Car customer=null;
//final String SELECT_QUERY = "select * from car where seats = ?";
//try(Connection con = DBConnection.getConnection();){
//	
//	pst = con.prepareStatement(SELECT_QUERY);
//	pst.setInt(1, seats);
//	rst = pst.executeQuery();
//	if(rst.next()){
//		 customer=new Car();
//		 customer.setcarId(rst.getInt(1));
//		 customer.setcarModel(rst.getString(2));
//		 customer.setseats(rst.getInt(3));
//		 customer.setrentPerDay(rst.getDouble(4));
//		 customer.setgiverId(rst.getInt(5));
//	System.out.println(customer);
//	}
//} catch (SQLException e) {
//	e.printStackTrace();
//}
//return customer;
//}	
public Car getCarById(int carId){
	
	PreparedStatement pst = null;
	ResultSet rst = null;
	Car customer=null;
final String SELECT_QUERY = "select * from car where carId = ?";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, carId);
	rst = pst.executeQuery();
	if(rst.next()){
		 customer=new Car();
		 customer.setcarId(rst.getInt(1));
		 customer.setcarModel(rst.getString(2));
		 customer.setseats(rst.getInt(3));
		 customer.setrentPerDay(rst.getDouble(4));
		 customer.setdriverName(rst.getString(5));
		 customer.setdriverMobileNo(rst.getInt(6));
		 customer.setgiverId(rst.getInt(7));
	System.out.println(customer);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return customer;
}	
public int deleteCar(int carId){
	
	PreparedStatement pst = null;
	int status = 0;
final String SELECT_QUERY = "delete from car where carId = ?";
try(Connection con = DBConnection.getConnection();){
	
	pst = con.prepareStatement(SELECT_QUERY);
	pst.setInt(1, carId);
	status = pst.executeUpdate();
	
	System.out.println(status);
} catch (SQLException e) {
	e.printStackTrace();
}
System.out.println(status);
return status;
}	

public int update(Car customer){
	final String INSERT_QUERY="update car set rentPerDay=? where carId =?";
	PreparedStatement pst = null;
	
	int status=0;
	
	try(Connection con=DBConnection.getConnection();) {
		pst=con.prepareStatement(INSERT_QUERY);
		pst.setString(1, customer.getcarModel());
		pst.setInt(2, customer.getseats());
		pst.setDouble(3, customer.getrentPerDay());
		pst.setString(4, customer.getdriverName());
		pst.setInt(5, customer.getdriverMobileNo());
		pst.setInt(6, customer.getgiverId());
		pst.setInt(7, customer.getcarId());
		
		status=pst.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}
//public Customer getCustomer(String userName,String password){
//	
//	PreparedStatement pst = null;
//	ResultSet rst = null;
//	Customer customer=null;
//final String SELECT_QUERY = "select * from customer where userName = ? and password = ?";
//try(Connection con = DBConnection.getConnection();){
//	
//	pst = con.prepareStatement(SELECT_QUERY);
//	pst.setString(1, userName);
//	pst.setString(2, password);
//	rst = pst.executeQuery();
//	if(rst.next()){
//		 customer=new Customer();
//		 customer.setCustomerId(rst.getInt(1));
//		 customer.setCustomerName(rst.getString(2));
//		 customer.setBalance(rst.getDouble(3));
//		 customer.setUserName(rst.getString(4));
//		 customer.setPassword(rst.getString(5));
//	System.out.println(customer);
//	}
//} catch (SQLException e) {
//	e.printStackTrace();
//}
//return customer;
//}

public List<Car> getAllCar(){
	List<Car> list=new ArrayList<>();
	
	PreparedStatement pst = null;
	ResultSet rst = null;
final String SELECT_QUERY = "select * from car ";
try(Connection con = DBConnection.getConnection();){
	pst = con.prepareStatement(SELECT_QUERY);
	rst = pst.executeQuery();
	while(rst.next()){
		Car customer=new Car();
		customer.setcarId(rst.getInt(1));
		customer.setcarModel(rst.getString(2));
		customer.setseats(rst.getInt(3));
		customer.setrentPerDay(rst.getDouble(4));
		customer.setdriverName(rst.getString(5));
		customer.setdriverMobileNo(rst.getInt(6));
		customer.setgiverId(rst.getInt(7));
		list.add(customer);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
return list;
}
}