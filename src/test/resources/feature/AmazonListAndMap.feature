Feature: to check user is able to login into flipkart website  and search the prdouct 

Scenario: To check if user enter valid username and valid
          password then he  gets sucessfully login to the website
         
Given The user is on the Homepage  of  the login page 
When user enter the valid username  in the username  field 
  |naudiyalhimanshu@gmail.com|
And  enter the valid password in the password field
  | Noida@601|
Then user  gets sucessfully login into the website
And user able  to see the HomePage of the website





 
 