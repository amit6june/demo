package com.example.demo.dao;

import com.example.demo.domain.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDao extends AbstractDao<Integer, User>{


   public List<User> findAllUser() {
            System.out.println("at dao-->>>");
            Criteria criteria = createEntityCriteria();
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
            List<User> allusers = (List<User>) criteria.list();
            System.out.println("at dao"+allusers);
            // No need to fetch userProfiles since we are not showing them on list page. Let them lazy load.
            // Uncomment below lines for eagerly fetching of userProfiles if you want.

		for(User user : allusers){
            System.out.println(user.getUsername());
        }
            return allusers;
        }

    @Override
    public User getByKey(Integer key) {
        System.out.println("at dao");
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("userid", 1));
        User user = (User)crit.uniqueResult();
        System.out.println("at dao"+user);

        return user;
    }
}
