package com.example.demo.Service;

import com.example.demo.dao.MembershipDao;
import com.example.demo.dao.UserDao;
import com.example.demo.domain.Memberships;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("membershipService")
@Transactional
public class MembershipServiceImpl implements MembershipService {

    @Autowired
    private MembershipDao membershipDao;

    @Override
    public Memberships getMembershipDetails(int i) {
        return null;
    }

    @Override
    public void addMembership(Memberships membership) {

        membershipDao.save(membership);

    }

    @Override
    public List getAllMemberShips() {


        return membershipDao.getAllMembership();
    }


}
