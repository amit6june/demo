package com.example.demo.Service;


import com.example.demo.dao.TopicDao;
import com.example.demo.dao.UserDao;
import com.example.demo.domain.Topic;
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


}
