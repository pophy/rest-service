package com.ipophy.controller;

import com.ipophy.Exception.UserException;
import com.ipophy.dao.UserDAOService;
import com.ipophy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResourceController {

    private final UserDAOService userDAOService;

    @Autowired
    public UserResourceController(UserDAOService userDAOService) {
        this.userDAOService = userDAOService;
    }

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return userDAOService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User getUserByID(@PathVariable int id) {
        User user = userDAOService.findOne(id);
        if (user == null) {
            throw new UserException("id- " + id);
        }
        return user;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = userDAOService.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = userDAOService.deleteById(id);
        if (user == null) {
            throw new UserException("USER NOT FOUND");
        }
    }

}
