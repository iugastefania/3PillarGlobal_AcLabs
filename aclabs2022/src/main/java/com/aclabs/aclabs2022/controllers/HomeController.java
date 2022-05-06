package com.aclabs.aclabs2022.controllers;

import com.aclabs.aclabs2022.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/getFirstString")
    public String getFirstString(){
        return homeService.getFirstString();
    }

    @GetMapping("/getAllStrings")
    public List<String> getAllStrings(){
        return homeService.getAllStrings();
    }

    @PostMapping("/addString")
    public void addString(@RequestBody String string){
        homeService.addString(string);
    }
}