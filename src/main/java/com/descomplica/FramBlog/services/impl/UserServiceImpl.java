package com.descomplica.FramBlog.services.impl;

import com.descomplica.FramBlog.models.User;
import com.descomplica.FramBlog.repositories.UserRepository;
import com.descomplica.FramBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(final User user) {
        User existingUser = userRepository.findByUserName(user.getUserName());
        if (Objects.nonNull(existingUser)){
            throw new RuntimeException("User already exists");
        }
        User entity = new User(user.getUserId(), user.getUserName(), user.getEmail(), user.getPassword(), user.getRole());
        User newUser = userRepository.save(entity);
        return new User(newUser.getUserId(), newUser.getUserName(), newUser.getEmail(), newUser.getPassword(), newUser.getRole());
    }
}
