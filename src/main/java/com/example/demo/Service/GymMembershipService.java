package com.example.demo.Service;

import com.example.demo.domain.Memberships;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("GymMembershipService")
//@Transactional
public class GymMembershipService  implements MembershipService {


    @Override
    public Memberships getMembershipDetails(int i) {

        System.out.println("Calling add getMembershipDetails of Gym");
        return null;
    }

    @Override
    public void addMembership(Memberships membership) {

       // do some aditional checks for gym like validate thats why this class is formed
        System.out.println("Calling add membership of Gym");

    }




}
