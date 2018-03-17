


home automation system

           1 member -- add member

            Policy LIC Policy
            Insurance - How many insurance policy
            Mutual funds how many mutual funds
            bank accounts  - how many joint accounts
           Upcoming  Bills - Phone bill
                     Credit card bill
                     Gas Bill
                     Electricity Bill

           List<Gadjets> listofgadjets   Gadjet --> Mobile Phone/TV/Ipad/iwatch/

           List<MutualFunds> listofmutualfunds

           List<HealthPolicy>  lifepolicy

           List<Shares> listofshares

           List<AccountHoldings> listofaccounts - bank accounts

           List<CreditCards> creditcards; -- Debit/credit

           List<Address> listfoaddress

           UserProfile<> userprofile -- like age/dob/sex/nationality - new object or just a userprofile id


            How to add a relatinship to this object ??? like wife etc?

           gadjet object -->                   Card Object

           gadject id                           card id
           gadject name                         card type - debit/credit
           gadjet price                         card expiray
           gadjet purchase date                 SHall I have a user objeect?

           Userprofile                          Account  - 1 accounts can have2musers
           age                                  Bank name
           dob                                  many to one --> user
                                                money in bank
           sex
           nationality




    what all it should do ?

    1.  add a jms to send a email when someactivity happens --->  JMS covered - active mq covered



    2. add logging -- log4j covered



    3. add encryption to some field and some data -- encryption and java keytool covered


    4. add load balancer later -- httpd covered



    5. add database -- common syntax and joins -- all left right outer inner covered + creating index
    or creating patition etc - covered



    6. java - inheritence/interface/abstarct class/int/long


    7. apply multithreading to some method



    6.add exception handling



    7. add list/domain object


    8. usage of enum


    9. add design pattern


    10. hibernate/spring covered



    11. java mockito


    12. add angular support




    Questions:

    1. shall i create two different objects clubmembesip/gymmembership or a single object membership??
    2.i think i should rather create a abstract class which defines the common method for both the membershiips
    there is no need for a interface
    3. MembershipService ???? this should not be a interface..
      this should be a abstract class which provived some functionality












