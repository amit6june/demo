package com.example.demo.domain;

public enum AccountType {


    SINGLE("SINGLE",1),
    JOINT("JOINT",2);

    AccountType(String description, Integer statusId) {
        this.description = description;
        this.statusId = statusId;
    }

    private String description;
    private Integer statusId;
}
