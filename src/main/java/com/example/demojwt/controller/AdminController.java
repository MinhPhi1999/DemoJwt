package com.example.demojwt.controller;

import com.example.demojwt.model.User;
import com.example.demojwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String userAccess() {
        return "Admin Content.";
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(userRepository.findAll(),HttpStatus.OK);
    }
}
