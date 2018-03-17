package com.example.demo.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BANKACCOUNT")
public class BankAccounts {

    @Id
    @Column(name="accountId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int accountId;

    @Column(name="BANK_NAME", unique=true, nullable=false)
    private String bankName;

    public BankAccounts(int accountId, String bankName, AccountType accountType, long accountBalance, Date openingDate, User user) {
        this.accountId = accountId;
        this.bankName = bankName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.openingDate = openingDate;
        this.user = user;
    }

    public BankAccounts() {
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }



    //Joint or Single

    @Enumerated(EnumType.STRING)
    @Column(name="ACCOUNT_TYPE")
    private AccountType accountType;

    @Column(name="ACCT_BALANCE", unique=true, nullable=false)
    private long accountBalance;

    @Column(name="OPENING_DATE", unique=true, nullable=false)
    private Date openingDate;


    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




}
