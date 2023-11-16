package com.prodemy.boot.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BannerDto {
	private Integer id;
	private String bannerName;
	private String bannerImage;
	private String description;

}
