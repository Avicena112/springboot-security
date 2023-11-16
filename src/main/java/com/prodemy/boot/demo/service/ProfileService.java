package com.prodemy.boot.demo.service;

import com.prodemy.boot.demo.model.Profile;

public interface ProfileService {
    Profile saveProfile(Profile profile);

	Profile getProfileById(Object id);
}
