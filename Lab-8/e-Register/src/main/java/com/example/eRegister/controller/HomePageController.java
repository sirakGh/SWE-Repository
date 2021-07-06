package com.example.eRegister.controller;

import com.example.eRegister.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(path = "api/student")
public class HomePageController {

    @Autowired
    StudentRepository d;
    @GetMapping(value={"/","/home","/index","/eRegistrar/home"})
    public String showHomePage(){
        return "home/index";
    }

}
