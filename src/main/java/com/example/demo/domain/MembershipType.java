package com.example.demo.domain;

public enum MembershipType {

    CLUBMEMBERSHIP("ClubMembership",1),
    GYMMEMBERSHIP("GymMembership",2);

    MembershipType(String description, Integer statusId) {
        this.description = description;
        this.statusId = statusId;
    }

    private String description;
    private Integer statusId;


}
