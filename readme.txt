


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







    // There is many to many betwen users and memberships
      because 1 user can have many memberships - bank/gym/spa

      and 1 membership can have many users..  spa can have 10 members


      but a relation between user and bank account is one to many
       as one user can have many bank accounts but one bank account can not have many users
       one bank account can only have a single user


       one to one is between user and user profile
       user profile is a child of user




      now one to many - unidirectional
            and biderectional --




      many to many

      books and authors

      1 book can be written by many authors
      1 author can write many books

      Books                    Authors
      javabook                 author1, author2
      book2, book3             author3





      one to many
      between guy and address
      one guy can have many address
      but one address belongs to mostly 1 guy


     one to many bidirectional
     when

     one to one
     one user can have only one user profile



unidirectional

 one user can be a part of many groups

 user object

 @manytoone
 group
 -----

group object
 name
 id

The main differenece is that bidirectional relationship provides
navigational access in both directions,
so that you can access the other side without explicit queries.
Also it allows you to apply cascading options to both directions.

Note that navigational access is not always good,
especially for "one-to-very-many" and "many-to-very-many" relationships.
Imagine a Group that contains thousands of Users.

so 1 group contains thousand of users
how will i access them



many to many

 stocks are of many categories

 one employee many projects and one project many employeee -- use join table in many to many

  one student in many coarse and 1 coarse can have many students




one to many
many items in a cart -
one cart can have so many items
  but one item can not in under many carts


an issue with one to many
one customer can have may orders



Customer Object

OnetoMany
private Set orders


Order Object
ManytoOne



http://agiledata.org/essays/mappingObjects.html


https://howtoprogramwithjava.com/hibernate-manytomany-unidirectional-bidirectional/



https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/

As straightforward as it might be in a RDBMS, when it comes to JPA,
the one-to-many database association can be represented either through a
 @ManyToOne or a @OneToMany association since the OOP association can be either unidirectional or bidirectional.

The @ManyToOne annotation allows you to map the Foreign Key column in the child entity
 mapping so that the child has an entity object reference to its parent entity.
 This is the most natural way of mapping a database one-to-many database association,
 and, usually, the most efficient alternative too.




https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/
 The best way to map a @OneToMany association is to rely on the @ManyToOne
 side to propagate all entity state changes:

one to many
http://www.baeldung.com/hibernate-one-to-many




javaj
http://www.baeldung.com/java-tutorial


product /category

product - beverage/dairy/food/grocery

category -chai/biscuit/pepsi







ager one to many karte hain
to
main object me list aaye

aur main object ko save karo to list bhi save ho jaaye
aur main object ke ander
@OneToMany(mappedBy="owner")


sawal hai kuch

databsae me colum kaise honge

read this hibernate
https://www.javacodegeeks.com/2011/02/hibernate-mapped-collections.html
https://stackoverflow.com/questions/3113885/difference-between-one-to-many-many-to-one-and-many-to-many
https://stackoverflow.com/questions/26328187/is-it-possible-to-limit-the-size-of-a-onetomany-collection-with-hibernate-or-jp/26329733#26329733
https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/


java basics
https://howtoprogramwithjava.com/programming-101-the-5-basic-concepts-of-any-programming-language/
https://beginnersbook.com/2013/04/java-garbage-collection/
https://www.tutorialspoint.com/java/java_generics.htm
https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value?rq=1
https://dzone.com/articles/pass-by-value-vs-reference-in-java

java interview
https://howtodoinjava.com/java-interview-questions/

java design
http://agiledata.org/essays/mappingObjects.html

java lamda
http://www.lambdafaq.org/why-are-lambda-expressions-being-added-to-java/
http://www.mkyong.com/tutorials/java-8-tutorials/

java spring
https://stackoverflow.com/questions/10534053/autowiring-two-beans-implementing-same-interface-how-to-set-default-bean-to-au?rq=1

java generics
https://docs.oracle.com/javase/tutorial/java/generics/why.html

java interface
https://www.artima.com/interfacedesign/contents.html
https://stackoverflow.com/questions/49002/prefer-composition-over-inheritance?rq=1

java and angular
http://www.devglan.com/spring-boot/spring-boot-angular-example

angular
https://codecraft.tv/courses/angular/quickstart/activity/
https://jcoop.io/angular-2-practice-exercises/

obsrrvable
https://stackoverflow.com/questions/37364973/angular-promise-vs-observable

javascript
https://medium.freecodecamp.org/javascript-modules-a-beginner-s-guide-783f7d7a5fcc

react
https://jscomplete.com/


javascript modules
https://www.youtube.com/watch?v=jN4IM5tp1SE

java collection
https://www.journaldev.com/1260/collections-in-java-tutorial?utm_source=website&utm_medium=sidebar&utm_campaign=RecommendedTutorials-Sidebar-Widget

https://www.javatpoint.com/java-arraylist

All three classes implement the Map interface and offer mostly the same functionality. The most important difference is the order in which iteration through the entries will happen:

HashMap makes absolutely no guarantees about the iteration order. It can (and will) even change completely when new elements are added.
TreeMap will iterate according to the "natural ordering" of the keys according to their compareTo() method (or an externally supplied Comparator). Additionally, it implements the SortedMap interface, which contains methods that depend on this sort order.
LinkedHashMap will iterate in the order in which the entries were put into the map

lets do one thing
to learn all type of relationships
1. one to one


2. one to many unidirectional   ---> one is having list ---- so its only one to many or only many to one


3. one to many bidirectional   ---> write in both objects


4. when to use only many to one -- one one side


5. many to many - usually we use join table

