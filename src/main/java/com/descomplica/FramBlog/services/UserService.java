package com.descomplica.FramBlog.services;

import com.descomplica.FramBlog.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User save(User user);
}
