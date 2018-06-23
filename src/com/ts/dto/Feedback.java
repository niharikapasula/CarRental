package com.ts.dto;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Feedback")
public class Feedback {
Scanner sc = new Scanner(System.in);
private int userId;

private int carId;

private String feedback;

public int getuserId() {
	return userId;
}
public void setuserId(int userId) {
	this.userId = userId;
}
public int getcarId() {
	return carId;
}
public void setcarId(int carId) {
	this.carId = carId;
}
public String getfeedback() {
	return feedback;
}
public void setfeedback(String feedback) {
	this.feedback = feedback;
}


@Override
public String toString() {
	return "Car [userId=" + userId + ", carId=" + carId + ", feedback=" + feedback+ "]";
}
}