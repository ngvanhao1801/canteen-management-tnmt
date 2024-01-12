package com.example.canteen.service.Impl;

import com.example.canteen.entity.Profile;
import com.example.canteen.reponsitory.ProfileReponsitory;
import com.example.canteen.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileReponsitory profileReponsitory;

    @Override
    public void update(Profile profile) {
        profileReponsitory.save(profile);
    }
}
