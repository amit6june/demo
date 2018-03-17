package com.example.demo.dao;

import com.example.demo.domain.BankAccounts;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bankAccountDao")
public class BankAccountsDao extends AbstractDao<Integer, BankAccounts> {


    public List<BankAccounts> findAllBanks() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("accountId"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<BankAccounts> allbanks= (List<BankAccounts>) criteria.list();

        // No need to fetch userProfiles since we are not showing them on list page. Let them lazy load.
        // Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
        return allbanks;
    }

    public void saveMyTopic(BankAccounts topic){


            persist(topic);

    }


}
