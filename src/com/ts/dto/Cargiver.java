package com.ts.dto;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cargiver {
Scanner sc = new Scanner(System.in);
private int giverId;
private String giverName;
private String emailId;
private int mobileNo;
private String password;
public int getgiverId() {
	return giverId;
}
public void setgiverId(int giverId) {
	this.giverId = giverId;
}
public String getgiverName() {
	return giverName;
}
public void setgiverName(String giverName) {
	this.giverName = giverName;
}
public String getemailId() {
	return emailId;
}
public void setemailId(String emailId) {
	this.emailId = emailId;
}
public int  getmobileNo() {
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
	return "Cargiver [giverId=" + giverId + ", giverName=" + giverName + ", emailId=" + emailId
			+ ", mobileNo=" + mobileNo + ", password=" + password + "]";
}
}