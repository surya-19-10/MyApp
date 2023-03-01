package com.surya.profile.service;

import com.surya.profile.core.Profile;
import com.surya.profile.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile getProfile(int profileId) {
        return profileRepository.findById(profileId).get();
    }

    public Profile updateProfile(int profileId, Profile profile) {
        return profileRepository.save(profile);
    }

    public void deleteProfile(int profileId) {
        profileRepository.deleteById(profileId);
    }
}
