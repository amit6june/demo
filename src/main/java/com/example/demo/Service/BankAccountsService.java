package com.example.demo.Service;

import com.example.demo.dao.BankAccountsDao;
import com.example.demo.domain.BankAccounts;
import com.example.demo.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("bankAccountsService")
@Transactional
public class BankAccountsService {


    @Autowired
    private BankAccountsDao bankAccountDao;


    public List <BankAccounts> getAllBanksAccount() {


            return bankAccountDao.findAllBanks();
        //return topics;
    }


    public List getAllAccounts() {

        return bankAccountDao.findAllBanks();
    }

    public Topic getAccountDetails(String s) {

        return null;
    }

    public void addBankAccount(BankAccounts bankAccounts){

    }

}
