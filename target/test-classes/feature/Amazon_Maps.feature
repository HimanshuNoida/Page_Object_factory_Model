@staging
Feature: to check user is able to login into Amazon website  and search the prdouct 

Scenario: To check if user enter valid username and valid
          password then he  gets sucessfully login to the website
       
         
Given The user is on the Homepage  of  the login page 
When user enter the valid username and password in the password  field 
  
  |       username           | password   |
  |naudiyalhimanshu@gmail.com| Noida@601  |
Then user  gets sucessfully login into the website
And user able  to see the HomePage of the website





 
 