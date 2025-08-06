package com.example.glycomate.repository;

import com.example.glycomate.model.UserProfile;

public class UserProfileRepository {
    private UserProfile profile;

    public void saveProfile(UserProfile profile) {
        this.profile = profile;
    }

    public UserProfile getProfile() {
        return profile;
    }
}
