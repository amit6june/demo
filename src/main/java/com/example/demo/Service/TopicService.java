package com.example.demo.Service;

import com.example.demo.dao.TopicDao;
import com.example.demo.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Arrays;
import java.util.List;

@Service("topicService")
@Transactional
public class TopicService {


    @Autowired
    private TopicDao topicDao;

    List<Topic> topics = Arrays.asList(new Topic("1", "AllOutStream", "Description"),
            new Topic("2", "Amit", "Description"),
            new Topic("3", "Ritu", "Description"));

    public List <Topic> getAllService() {


            return topicDao.findAllTopics();
        //return topics;
    }


    public Topic getSingleTopic(String id){
         /*for(Topic locallist:topics){
             if(locallist.getId().equals(id)) {
                 return locallist;
             }

         }*/

         return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        //return null;
    }

    public void addSingleTopic(Topic topic) {

        topicDao.saveMyTopic(topic);
    }
}
