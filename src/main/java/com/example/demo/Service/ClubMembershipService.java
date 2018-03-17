package com.example.demo.Service;

import com.example.demo.dao.MembershipDao;
import com.example.demo.dao.TopicDao;
import com.example.demo.domain.Memberships;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ClubMembershipService")
@Transactional(readOnly=false)
public class ClubMembershipService  implements MembershipService {


    @Autowired
    private MembershipDao membershipDao;


    @Override
    public Memberships getMembershipDetails(int i) {

        System.out.println("Calling add membership of getMembershipDetails");

        return null;
    }

    @Override
    public void addMembership(Memberships membership) {

        System.out.println("Calling add membership of Club---->>>>");

        membershipDao.saveMyTopic(membership);

    }




}
