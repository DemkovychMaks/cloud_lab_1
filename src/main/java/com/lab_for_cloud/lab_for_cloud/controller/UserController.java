package com.lab_for_cloud.lab_for_cloud.controller;

import com.lab_for_cloud.lab_for_cloud.DTO.UserDTO;
import com.lab_for_cloud.lab_for_cloud.domain.User;
import com.lab_for_cloud.lab_for_cloud.service.AbstractService;
import com.lab_for_cloud.lab_for_cloud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab_for_cloud.lab_for_cloud.mapper.AbstractMapper;
import com.lab_for_cloud.lab_for_cloud.mapper.UserMapper;

@RequestMapping(value = "/user")
@RestController
@AllArgsConstructor
public class UserController extends AbstractController<User, UserDTO, Integer> {
    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    public AbstractService<User, Integer> getService() {
        return userService;
    }

    @Override
    public AbstractMapper<User, UserDTO> getMapper() {
        return userMapper;
    }
}