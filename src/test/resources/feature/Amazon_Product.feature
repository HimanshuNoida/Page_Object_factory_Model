
Feature: To check user  should  able to add product into the cart
  
     In order to check when a user of Amazon Account 
     log in then  he should be succesffuly login
     and should able to add products into the cart

  Background: 
    Given user is on the Login Page of the Amazon website "https://www.amazon.in/"


  Scenario: User succesfully gets login to the Amazon website
    And user click the login link to enter login and password respectively
    When user enter the valid username of the account
      | naudiyalhimanshu@gmail.com |
    And user enter the valid password of the Account
      | Noida@601 |
    Then user login to login on to the Amazon website
    

  Scenario: when user is on the Amazon Home page
    Then : he  click over the "ALL" category
    And click category
      | Best Sellers |
    Then he is able to "Bestsellers" Text on the next page
    Then he is able  to Add product on the page
