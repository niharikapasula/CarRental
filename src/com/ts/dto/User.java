package com.ts.dto;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User{
Scanner sc = new Scanner(System.in);
private int userId;
private String userName;
private String emailId;
private int mobileNo;
private String password;
public int getuserId() {
	return userId;
}
public void setuserId(int userId) {
	this.userId = userId;
}
public String getuserName() {
	return userName;
}
public void setuserName(String userName) {
	this.userName = userName;
}
public String getemailId() {
	return emailId;
}
public void setemailId(String emailId) {
	this.emailId= emailId;
}
public int getmobileNo() {
	return mobileNo;
}
public void setmobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId
			+ ", mobileNo=" + mobileNo + ", password=" + password + "]";
}
}