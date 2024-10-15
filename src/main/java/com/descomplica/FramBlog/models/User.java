package com.descomplica.FramBlog.models;

import com.descomplica.FramBlog.enums.RoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String userName;
    private String email;
    private String password;
    private RoleEnum role;

    public User(final Long userId,final String userName,final String email,final String password,final RoleEnum role) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
