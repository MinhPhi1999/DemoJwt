package com.example.demojwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mod")
@CrossOrigin("*")
public class ModController {
    @GetMapping
    public String userAccess() {
        return "Mod Content.";
    }
}
