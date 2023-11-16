package com.prodemy.boot.demo.model;

public class ApiResponse {
	 private int status;
	 private String message;
	 private BalanceData data;
	 
	public ApiResponse() {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BalanceData getData() {
		return data;
	}
	public void setData(BalanceData data) {
		this.data = data;
	}
	 

}
