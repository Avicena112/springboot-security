package com.prodemy.boot.demo.model.request;

public class TopUpRequest {
	
	   private int topUpAmount;

	public TopUpRequest(int topUpAmount) {
		super();
		this.topUpAmount = topUpAmount;
	}

	public int getTopUpAmount() {
		return topUpAmount;
	}

	public void setTopUpAmount(int topUpAmount) {
		this.topUpAmount = topUpAmount;
	}
	   

}
