package com.example.demo.Service;


import com.example.demo.dao.UserDao;
import com.example.demo.domain.Memberships;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userervice")
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUser() {

        System.out.println("---->>>>");
        return userDao.findAllUser();
        //return topics;
    }


    public void addUser(User user) {

        System.out.println("Calling add membership of Club");

        userDao.saveUser(user);

    }

    public User getuserById(Integer userId) {

        System.out.println("Calling add membership of Club");

        User user=userDao.getByKey(userId);

        return user;

    }


}
