
Feature: To search any product from the searchabar and can purchase it
  
         In order to check that user can enter any product in the search bar 
         and can purchase from them


Scenario Outline: Enter the item name in the search bar and can purchase from there
    Given user is on the search bar page
    
    When user enter the item name "<shoes>" in the search bar and click search
    Then item should display and
    And user should able to add it to cart
    And Select the address where user want to deleiver
    And purchase it after payment perform succesfull
    
Examples:
       
       |shoes|
       |shoes|
       
     
    
   