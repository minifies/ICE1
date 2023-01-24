package com.example.Lecture3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;

@Controller
public class DemoController {
    @GetMapping("/")
    public String goHome(){
        return "index";
    }
    @GetMapping("/register")
    public String registerUser(@RequestParam(name = "fName")String firstName,
                               @RequestParam String lastName,
                               @RequestParam(defaultValue = "off") String rememberMe) {
        System.out.println(firstName + "" + lastName + "" + rememberMe);
        return "success";
    }
    @GetMapping("/register_page")
    public String goRegister() {
        return "register";
    }
    }
