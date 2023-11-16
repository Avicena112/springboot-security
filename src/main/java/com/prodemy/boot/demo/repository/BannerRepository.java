package com.prodemy.boot.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.prodemy.boot.demo.model.Banner;

public interface BannerRepository extends CrudRepository<Banner, Integer> {

}
