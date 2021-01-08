package com.orco.controllers;

import com.orco.converters.UserMapper;
import com.orco.domain.UserCommand;
import com.orco.entities.User;

public class UserController {

    public User saveUser(UserCommand command) {

        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
