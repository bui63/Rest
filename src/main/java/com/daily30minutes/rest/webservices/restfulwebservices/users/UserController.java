package com.daily30minutes.rest.webservices.restfulwebservices.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService service;
    //GET /users
    // retrieveAllUsers
    @GetMapping("/users")
    public List<User> retrieveAllUsers()
    {
        return service.findALL();
    }

    //GET /user/{id}
    //retrieveUser
    @GetMapping("/user/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }
    
    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        service.save(user);
    }
}
