package com.example.demo.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="MEMBERSHIP")
public class  Memberships {


// There is many to many betwen users and memberships
    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }



    @Id
    @Column(name="membershipId")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int membershipId;

    @Column(name="NAME", unique=true, nullable=false)
    private String name;

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    @Enumerated(EnumType.STRING)
    @Column(name="MEMBER_STATUS")
    private MembershipType membershipType;

    @Column(name="JOINING_DATE", unique=true, nullable=false)
    private Date joiningDate;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




}
