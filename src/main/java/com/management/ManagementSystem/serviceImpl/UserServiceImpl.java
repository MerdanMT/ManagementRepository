package com.management.ManagementSystem.serviceImpl;

import com.management.ManagementSystem.entity.User;
import com.management.ManagementSystem.repository.UserRepository;
import com.management.ManagementSystem.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(Long id,User user) {
        User foundedId = userRepository.findById(id).orElse(null);
        foundedId.setAddress(user.getAddress());
        foundedId.setEmail(user.getEmail());

        userRepository.save(foundedId);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
