package com.demo.service;

import com.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
}
