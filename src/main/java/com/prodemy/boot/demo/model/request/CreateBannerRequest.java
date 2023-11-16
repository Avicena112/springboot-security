package com.prodemy.boot.demo.model.request;

import lombok.Data;

@Data
public class CreateBannerRequest {
	 private String bannerName;
	    private String bannerImage;
	    private String description;

}
