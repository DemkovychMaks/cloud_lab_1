package com.lab_for_cloud.lab_for_cloud.service;

import com.lab_for_cloud.lab_for_cloud.domain.User;
import com.lab_for_cloud.lab_for_cloud.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService extends AbstractService<User, Integer> {
    public UserRepository userRepository;

    @Override
    protected JpaRepository<User, Integer> getRepository() {
        return userRepository;
    }
}
