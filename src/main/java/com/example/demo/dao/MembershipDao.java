package com.example.demo.dao;

import com.example.demo.domain.BankAccounts;
import com.example.demo.domain.Memberships;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("membershipDao")
public class MembershipDao extends AbstractDao<Integer, Memberships>{


    public void save(Memberships memberships){


        persist(memberships);

    }

    public List<Memberships> getAllMembership() {
        Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<Memberships> allmemberships= (List<Memberships>) criteria.list();

        // No need to fetch userProfiles since we are not showing them on list page. Let them lazy load.
        // Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
        return allmemberships;
    }


}
