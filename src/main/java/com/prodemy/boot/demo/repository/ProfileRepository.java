package com.prodemy.boot.demo.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.prodemy.boot.demo.model.Profile;



public interface ProfileRepository extends CrudRepository<Profile, Long>{

}
