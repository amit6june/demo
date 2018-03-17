package com.example.demo.controller;

import com.example.demo.Service.TopicService;
import com.example.demo.domain.Topic;
import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


    @RequestMapping("/alltopics")
    public List getAllTopics() {


        return topicService.getAllService();

    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id) {


        return topicService.getSingleTopic("1");

    }

    @RequestMapping(method = POST ,consumes = MediaType.APPLICATION_JSON_VALUE,value="/topic")
    public void addTopic(@RequestBody Topic topic) {

        System.out.println("This is coming here");
         topicService.addSingleTopic(topic);

    }
}




