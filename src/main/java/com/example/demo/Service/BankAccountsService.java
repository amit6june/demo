package com.example.demo.Service;

import com.example.demo.dao.BankAccountsDao;
import com.example.demo.domain.BankAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bankAccountsService")
@Transactional
public class BankAccountsService {


    @Autowired
    private BankAccountsDao bankAccountDao;


    public List <BankAccounts> getAllBanksAccount() {


            return bankAccountDao.findAllBanks();

    }


    public List getAllAccounts() {

        return bankAccountDao.findAllBanks();
    }


}
