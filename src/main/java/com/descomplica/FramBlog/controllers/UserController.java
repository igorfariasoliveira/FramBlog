package com.descomplica.FramBlog.controllers;

import com.descomplica.FramBlog.models.User;
import com.descomplica.FramBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    private @ResponseBody User save(@RequestBody User user) {
        return  userService.save(user);
    }
}
