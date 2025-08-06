package com.example.glycomate.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.glycomate.model.UserProfile;

public class UserProfileViewModel extends ViewModel {
    private final MutableLiveData<UserProfile> profile = new MutableLiveData<>();

    public void setProfile(UserProfile userProfile) {
        profile.setValue(userProfile);
    }

    public LiveData<UserProfile> getProfile() {
        return profile;
    }
}
