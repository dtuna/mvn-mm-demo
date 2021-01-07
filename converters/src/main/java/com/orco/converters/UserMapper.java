package com.orco.converters;

import com.orco.domain.UserCommand;
import com.orco.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserMapper userToUseCommand(User user);

    UserCommand userCommandToUser(UserCommand userCommand);
}
