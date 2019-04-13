package com.ymhase.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.ymhase.rest.messenger.model.Profile;

public class ProfileService {

    List<Profile> profileList = null;

    public ProfileService() {

	this.profileList = new ArrayList<>();
	
	profileList.add(new Profile("abcd", 2));

    }

    public List<Profile> addProfile(Profile profile) {

	profile.setId(profileList.size() + 1);
	profileList.add(profile);
	return profileList;

    }

    public void update(int id, Profile profile) {

	profileList.set(id, profile);

    }

    public void removeProfile(int id) {

	profileList.remove(id);
    }

    public List<Profile> getProfiles() {

	return profileList;
    }
}
