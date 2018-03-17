package com.example.demo.dao;

import com.example.demo.domain.Memberships;
import com.example.demo.domain.Topic;
import org.springframework.stereotype.Repository;

@Repository("membershipDao")
public class MembershipDao extends AbstractDao<Integer, Memberships>{


    public void saveMyTopic(Memberships memberships){


        persist(memberships);

    }


}
