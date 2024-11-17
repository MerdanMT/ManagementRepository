package com.management.ManagementSystem.service;

import com.management.ManagementSystem.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

    public interface UserService {

    List<User> findAll();

    User findById(long id);

    void save(User user);

    void update(Long id,User user);

    void delete(long id);

}
