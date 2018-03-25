select * from MEMBERSHIP


create table MEMBERSHIP

CREATE TABLE MEMBERSHIP (
   membershipId  int primary key,
    NAME varchar(255),
    MEMBER_STATUS varchar(255),
    JOINING_DATE DATE,
  USER_ID int
);

ALTER TABLE MEMBERSHIP MODIFY COLUMN membershipId INT auto_increment

insert into MEMBERSHIP values(1,"MyGym","1",DATE '2015-12-17');


drop table MEMBERSHIP

select * from USER


CREATE TABLE BANKACCOUNT (
   accountId  int primary key,
    BANK_NAME varchar(255),
    ACCOUNT_TYPE varchar(255),
    OPENING_DATE DATE,
    ACCT_BALANCE int,
    USER_ID int
);

drop table BANKACCOUNT
insert into BANKACCOUNT values(1,"NAB","1",null,100,1);

insert into BANKACCOUNT values(2,"ING","1",null,200,1);
ALTER TABLE BANKACCOUNT MODIFY COLUMN accountId INT auto_increment


select * from BANKACCOUNT
ALTER TABLE BANKACCOUNT
ADD FOREIGN KEY (USER_ID) REFERENCES USER(USER_ID);



CREATE TABLE USER (
   USER_ID  int primary key,
    USER_NAME varchar(255),
    AGE int
);

ALTER TABLE USER MODIFY COLUMN USER_ID INT auto_increment


insert into USER values(1,"Amit",30);




select
        this_.USER_ID as USER_ID1_3_1_,
        this_.AGE as AGE2_3_1_,
        this_.USER_NAME as USER_NAM3_3_1_,
        bankaccoun2_.USER_ID as USER_ID6_3_3_,
        bankaccoun2_.accountId as accountI1_0_3_,
        bankaccoun2_.accountId as accountI1_0_0_,
        bankaccoun2_.ACCT_BALANCE as ACCT_BAL2_0_0_,
        bankaccoun2_.ACCOUNT_TYPE as ACCOUNT_3_0_0_,
        bankaccoun2_.BANK_NAME as BANK_NAM4_0_0_,
        bankaccoun2_.OPENING_DATE as OPENING_5_0_0_,
        bankaccoun2_.USER_ID as USER_ID6_0_0_
    from
        USER this_
    left outer join
        BANKACCOUNT bankaccoun2_
            on this_.USER_ID=bankaccoun2_.USER_ID




             select
        this_.accountId as accountI1_0_0_,
        this_.ACCT_BALANCE as ACCT_BAL2_0_0_,
        this_.ACCOUNT_TYPE as ACCOUNT_3_0_0_,
        this_.BANK_NAME as BANK_NAM4_0_0_,
        this_.OPENING_DATE as OPENING_5_0_0_,
        this_.USER_ID as USER_ID6_0_0_
    from
        BANKACCOUNT this_
    order by
        this_.accountId asc

        select * from BANKACCOUNT

