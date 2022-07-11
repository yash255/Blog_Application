package com.blog.services.Impl;

import com.blog.entities.User;
import com.blog.payloads.UserDto;
import com.blog.repositories.UserRepo;
import com.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = this.dtoToUser(userDto);
     User saveduser =   this.userRepo.save(user);
        return this.userToDto(saveduser);
    }

    @Override
    public UserDto updateUser(UserDto user, Integer userId) {
        return null;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    private User dtoToUser(UserDto userDto){
        User user1 =  new User();
        user1.setId(user1.getId());
        user1.setName(userDto.getName());
        user1.setEmail(userDto.getEmail());
        user1.setAbout(userDto.getAbout());
        user1.setPassword(userDto.getPassword());
        return user1;
    }
    public UserDto userToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(userDto.getId());
        userDto.setAbout(userDto.getAbout());
        userDto.setEmail(userDto.getEmail());
        userDto.setName(userDto.getName());
        userDto.setPassword(userDto.getPassword());
        return userDto;
    }
}
