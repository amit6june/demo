package com.example.demo.controller;

import com.example.demo.Service.BankAccountsService;
import com.example.demo.Service.TopicService;
import com.example.demo.domain.BankAccounts;
import com.example.demo.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BankAccountController {

    @Autowired
    private BankAccountsService bankAccountsService;


    @RequestMapping("/allbankAccounts")
    public List<BankAccounts> getAllBankAccounts() {


        return bankAccountsService.getAllAccounts();

    }

    @RequestMapping("/bankaccount/{id}")
    public List<BankAccounts> getBankAccount(@PathVariable String id) {


        return bankAccountsService.getAllBanksAccount();

    }

    @RequestMapping(method = POST ,consumes = MediaType.APPLICATION_JSON_VALUE,value="/addBank")
    public void addBankAccount(@RequestBody BankAccounts bankaccount) {

        System.out.println("This is coming here");
        bankAccountsService.addBankAccount(bankaccount);

    }
}
