package com.example.demo.dao;

import com.example.demo.domain.Topic;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("topicDao")
public class TopicDao extends AbstractDao<Integer, Topic> {


    public List<Topic> findAllTopics() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<Topic> alltopics = (List<Topic>) criteria.list();

        // No need to fetch userProfiles since we are not showing them on list page. Let them lazy load.
        // Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
        return alltopics;
    }

    public void saveMyTopic(Topic topic){


            persist(topic);

    }


}
