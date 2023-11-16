package com.prodemy.boot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prodemy.boot.demo.model.Profile;
import com.prodemy.boot.demo.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

	@Override
	public Profile getProfileById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}
}
