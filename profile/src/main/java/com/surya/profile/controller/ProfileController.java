package com.surya.profile.controller;

import com.surya.profile.core.Profile;
import com.surya.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/")
    public Profile saveProfile(@RequestBody Profile profile) {
        return profileService.saveProfile(profile);
    }

    @GetMapping("/{profileId}")
    public Profile getProfile(@PathVariable int profileId) {
        return profileService.getProfile(profileId);
    }

    @PutMapping("/{profileId}")
    public Profile updateProfile(@PathVariable int profileId, @RequestBody Profile profile) {
        return profileService.updateProfile(profileId, profile);
    }

    @DeleteMapping("/{profileId}")
    public void deleteProfile(@PathVariable int profileId) {
        profileService.deleteProfile(profileId);
    }
}
