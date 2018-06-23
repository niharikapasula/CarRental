package com.ts.dto;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Car {
Scanner sc = new Scanner(System.in);
private int carId;
private String carModel;
private int seats;
private double rentPerDay;
private String driverName;
private int driverMobileNo;
private int giverId;
public int getcarId() {
	return carId;
}
public void setcarId(int carId) {
	this.carId = carId;
}
public String getcarModel() {
	return carModel;
}
public void setcarModel(String carModel) {
	this.carModel = carModel;
}
public int getseats() {
	return seats;
}
public void setseats(int seats) {
	this.seats = seats;
}
public double getrentPerDay() {
	return rentPerDay;
}
public void setrentPerDay(double rentPerDay) {
	this.rentPerDay = rentPerDay;
}
public String getdriverName() {
	return driverName;
}
public void setdriverName(String driverName) {
	this.driverName = driverName;
}
public int getdriverMobileNo() {
	return driverMobileNo;
}
public void setdriverMobileNo(int driverMobileNo) {
	this.driverMobileNo = driverMobileNo;
}
public int getgiverId() {
	return giverId;
}
public void setgiverId(int giverId) {
	this.giverId = giverId;
}
@Override
public String toString() {
	return "Car [carId=" + carId + ", carModel=" + carModel + ", seats=" + seats
			+",driverName="+driverName+",driverMobileNo="+driverMobileNo+ ", rentPerDay=" + rentPerDay + ", giverId=" + giverId + "]";
}
}