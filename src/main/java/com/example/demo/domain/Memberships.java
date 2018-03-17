package com.example.demo.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="MEMBERSHIP")
public class  Memberships {



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

    public MemberStatus getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MemberStatus membershipType) {
        this.membershipType = membershipType;
    }

    @Enumerated(EnumType.STRING)
    @Column(name="MEMBER_STATUS")
    private MemberStatus membershipType;

    @Column(name="JOINING_DATE", unique=true, nullable=false)
    private Date joiningDate;




}
