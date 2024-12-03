package com.example.demo.controller;

import java.util.List;

public class StudentReceiverResponse {
	
	//statuscode +statusmessage +stdlist
	
	private int statuscode;
	private String statusMessage;
	private List<Student> stdlist;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public List<Student> getStdlist() {
		return stdlist;
	}
	public void setStdlist(List<Student> stdlist) {
		this.stdlist = stdlist;
	}
	
	


}
