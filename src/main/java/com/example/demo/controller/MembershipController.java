package com.example.demo.controller;

import com.example.demo.Service.BankAccountsService;
import com.example.demo.Service.ClubMembershipService;
import com.example.demo.Service.GymMembershipService;
import com.example.demo.Service.MembershipService;
import com.example.demo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class MembershipController {

    //@Autowired
   //private MembershipService membershipService;

    @Autowired
    private GymMembershipService gymMembershipService;

    @Autowired
    private ClubMembershipService clubMembershipService;



    @RequestMapping("/allmemberships")
    public List getAllMemberships() {

        System.out.println("Calling membershipcontroller");


        //return membershipService.getAllMemberShips();
        return null;

    }

    @RequestMapping("/membership/{id}")
    public Memberships getMembership(@PathVariable int id) {


        //shall i create a new controller for gym and new for club


        //return membershipService.getMembershipDetails(1);
        return null;

    }

    //Shall i create 2 methods addGymmemberhip and add clubmembership or only one addmembership

    @RequestMapping(method = POST ,consumes = MediaType.APPLICATION_JSON_VALUE,value="/addMembership")
    public void addClubMemberShip(@RequestBody  Memberships membership) {


     //depends on what has been sent from frontend
        Memberships member =new GymMembership();

        member.setJoiningDate(Calendar.getInstance().getTime());
        member.setName("The name of membership");




        System.out.println("This is coming here");
        clubMembershipService.addMembership(membership);

    }

    @RequestMapping(method = POST ,consumes = MediaType.APPLICATION_JSON_VALUE,value="/addGymMembership")
    public void addGymMemberShip(@RequestBody  Memberships membership) {


        //depends on what has been sent from frontend
        Memberships member =new GymMembership();

        member.setJoiningDate(Calendar.getInstance().getTime());
        member.setName("The name of membership");


        System.out.println("This is coming here");
        gymMembershipService.addMembership(membership);

    }


}
