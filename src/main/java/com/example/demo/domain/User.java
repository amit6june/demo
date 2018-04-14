package com.example.demo.domain;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="USER")
public class User {

    @Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long userid;

    @Column(name="USER_NAME", unique=true, nullable=false)
    private String username;

    //should i create int or long ???
    @Column(name="AGE", unique=true, nullable=false)
    private int age;

    //Id or object??? Shall i create a object here or in its object ??
   // private UserProfile userprofile;

    //private List<Mobile> mobilelist;

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //private List<Gadjets> gadjetsList;


    //@OneToMany(targetEntity=BankAccounts.class, mappedBy="user", fetch=FetchType.EAGER)
    //private List<BankAccounts> bankAccountsList;


    //private List<Insurance> insuranceList;

    //private List<Cards> cardList;

    //private List<Equity> equityList;

    //shall i create a object of one gym and club Sports club membership

    //public List<Memberships> getListMemberShips() {
     //   return listMemberShips;
   // }

    //public void setListMemberShips(List<Memberships> listMemberShips) {
   //     this.listMemberShips = listMemberShips;
    //}

    //@OneToMany(mappedBy="user",cascade = CascadeType.ALL)
    //private List<Memberships> listMemberShips;



}
