package com.prodemy.boot.demo.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddBannerRequest {
	private String bannerName;
	private String bannerImage;
	private String description;

}
