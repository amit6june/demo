package com.example.demo.Service;

import com.example.demo.domain.Memberships;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface MembershipService {



    Memberships getMembershipDetails(int i);

    void addMembership(Memberships membership);


    List getAllMemberShips();
}
