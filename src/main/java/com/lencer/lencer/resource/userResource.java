package com.lencer.lencer.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/user")
public class userResource {

    @GetMapping("/home")
    public String showUser(){
        return "app works ";
    }

}
