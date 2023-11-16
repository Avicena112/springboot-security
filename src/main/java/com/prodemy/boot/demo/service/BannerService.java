package com.prodemy.boot.demo.service;

import org.springframework.stereotype.Service;

import com.prodemy.boot.demo.dto.BannerDto;
import com.prodemy.boot.demo.model.Banner;


public interface BannerService {
	BannerDto saveBanner(Banner entity);

}
