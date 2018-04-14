package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @RequestMapping("/allusers")
    public List<User> getAllTopics() {

        List<User> allusers=new ArrayList<>();
        allusers= userService.getAllUser();

       //  I will create different types of Map here to understand whats happening
        // SO that i know what all maps are used and when they can be used,

        // I will create a loop in java 8

        //allusers.forEach(alluser-> System.out.println(alluser.getUsername()));


        for(User user:allusers){

          //  System.out.println("From this side->"+user.getListMemberShips());
        }


        String user1=allusers.get(0).getUsername();


        myi greetingfunction= () ->System.out.print("Hi lamba");

        myi2 mylambda= (String s) ->s.length();
        mylambda.lambatest2("Thisone");


        return allusers;



    }

    public void greet(){
        System.out.print("I am greet");
    }

    interface myi{
        void lambatest();
    }

    interface myi2{
        int lambatest2(String abc);
    }

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @RequestMapping(method = POST ,consumes = MediaType.APPLICATION_JSON_VALUE,value="/addUser")
    public void addUser(@RequestBody User user) {



        System.out.println("This is coming here");
        userService.addUser(user);

    }

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @RequestMapping(method = POST ,consumes = MediaType.APPLICATION_JSON_VALUE,value="/allmycollections")
    public void colectionsExample(@RequestBody User user) {



        System.out.println("This is coming here");


    }



}
