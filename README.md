# selenium-testng-maven-jenkins
This project is an example of unit and integration testing using selenium, testng, maven and jenkins framework in java language.  
It is an example of Page Object Model implementation on Flixbus web application. 

**Prerequisite**
Jenkins 
Maven 
Eclipse
TestNG

***BUILD**
mvn clean 
mvn install

**RUN**
1. From Application Main Class
2. From TestNG xml files 
3. From Maven pom.xml file
4. From Jenkins, which will be available on http://localhost:8080

Application is tested using Page Object Model approaches using java:

Unit
[src/test/java/com/test/Search_Page_Unit_Test.java](https://github.com/robinch93/selenium-testng-maven-jenkins/blob/master/com.learn.maven/src/test/java/com/test/Search_Page_Unit_Test.java)

Integration test
[src/test/java/com/test/Ticket_Booking_Integration_Test.java](https://github.com/robinch93/selenium-testng-maven-jenkins/blob/master/com.learn.maven/src/test/java/com/test/Ticket_Booking_Integration_Test.java)

Application Pages
[src/test/java/com/flixbus/pages/Flixbus_search_page.java](https://github.com/robinch93/selenium-testng-maven-jenkins/blob/master/com.learn.maven/src/test/java/com/flixbus/pages/Flixbus_search_page.java)
[src/test/java/com/flixbus/pages/Flixbus_booking_page.java](https://github.com/robinch93/selenium-testng-maven-jenkins/blob/master/com.learn.maven/src/test/java/com/flixbus/pages/Flixbus_booking_page.java)

TestNG Suite xml
[src/test/resources/Suite/IntegrationTest.xml](https://github.com/robinch93/selenium-testng-maven-jenkins/blob/master/com.learn.maven/src/test/resources/Suite/IntegrationTest.xml)
[src/test/resources/Suite/UnitTest.xml](https://github.com/robinch93/selenium-testng-maven-jenkins/blob/master/com.learn.maven/src/test/resources/Suite/UnitTest.xml)

Maven POM.xml
com.learn.maven/pom.xml(https://github.com/robinch93/selenium-testng-maven-jenkins/blob/master/com.learn.maven/pom.xml)









