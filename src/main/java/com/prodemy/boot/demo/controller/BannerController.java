package com.prodemy.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.boot.demo.dto.BannerDto;
import com.prodemy.boot.demo.model.Banner;
import com.prodemy.boot.demo.model.request.AddBannerRequest;
import com.prodemy.boot.demo.model.response.HttpResponseModel;
import com.prodemy.boot.demo.repository.BannerRepository;
import com.prodemy.boot.demo.service.BannerService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/banner")
public class BannerController {
	@Autowired private BannerRepository repo;
	@Autowired private BannerService service;
	
	@Operation(summary = "Add new banner", description = "Adding new banner")
	@PostMapping
	public HttpResponseModel<BannerDto> addBanner(@RequestBody AddBannerRequest req) {
		HttpResponseModel<BannerDto> resp = new HttpResponseModel<>();
		
		Banner entity = Banner.builder()
				.bannerName(req.getBannerName())
				.bannerImage(req.getBannerImage())
				.description(req.getDescription())
				.build();
		
		resp.setStatus(0);
		resp.setData(convertToDto(this.service.saveBanner(entity)));
		
		return resp;
	}

	private BannerDto convertToDto(Object saveBanner) {
		// TODO Auto-generated method stub
		return null;
	}

}
