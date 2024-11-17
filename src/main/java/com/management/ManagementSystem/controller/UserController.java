package com.management.ManagementSystem.controller;

import com.management.ManagementSystem.entity.User;
import com.management.ManagementSystem.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/get_all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
   public User findById(@PathVariable long id){
        return userService.findById(id);
   }

   @PostMapping("/users/save")
   public void save(@RequestBody User user){
        userService.save(user);
   }

   @PutMapping("/users/update/{id}")
    public void update(@PathVariable Long id,@RequestBody User user){
        userService.update(id, user);
    }

    @DeleteMapping("/users/delete/{id}")
    public void delete(@PathVariable long id){
        userService.delete(id);
    }
}
