
Feature: User can search and purchased the product
  
            In order to check user can search and buy any product


  Scenario: when user search any product in the search bar and click add to cart then he is able to purchase the order
               
                In order to check when user enter the item 
                in the search bar and purchased it then he is
                able to purchased the order 
                
     Given User is on the home Page of the Amazon website 
     When user select the category in the category bar 
     And select the searched product based on the selected category
     Then user select the item 
     And click Add to cart
     And select the Deleivery Address 
     And perform the payment 
     Then order should should done sucessfully

