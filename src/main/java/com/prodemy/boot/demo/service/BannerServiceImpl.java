package com.prodemy.boot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prodemy.boot.demo.model.Banner;
import com.prodemy.boot.demo.dto.BannerDto;
import com.prodemy.boot.demo.repository.BannerRepository;


@Service
public class BannerServiceImpl implements BannerService {
	@Autowired
    private BannerRepository bannerRepository;

    @Override
    public BannerDto saveBanner(Banner entity) {
        Banner savedBanner = bannerRepository.save(entity);
        return convertToDto(savedBanner);
    }

    private BannerDto convertToDto(Banner banner) {
        return BannerDto.builder()
                .id(banner.getId())
                .bannerName(banner.getBannerName())
                .bannerImage(banner.getBannerImage())
                .description(banner.getDescription())
                .build();
    }

}
