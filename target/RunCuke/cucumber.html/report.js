$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Amazon_Product.feature");
formatter.feature({
  "name": "To check user  should  able to add product into the cart",
  "description": "     In order to check when a user of Amazon Account \n     log in then  he should be succesffuly login\n     and should able to add products into the cart",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Login Page of the Amazon website \"https://www.amazon.in/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.user_is_on_the_Login_Page_of_the_Amazon_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User succesfully gets login to the Amazon website",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click the login link to enter login and password respectively",
  "keyword": "And "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.user_click_the_login_link_to_enter_login_and_password_respectively()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the valid username of the account",
  "rows": [
    {
      "cells": [
        "naudiyalhimanshu@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.user_enter_the_valid_username_of_the_account(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the valid password of the Account",
  "rows": [
    {
      "cells": [
        "Noida@601"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.user_enter_the_valid_password_of_the_Account(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login to login on to the Amazon website",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.user_login_to_login_on_to_the_Amazon_website()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Login Page of the Amazon website \"https://www.amazon.in/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.user_is_on_the_Login_Page_of_the_Amazon_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "when user is on the Amazon Home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": ": he  click over the \"ALL\" category",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.he_click_over_the_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click category",
  "rows": [
    {
      "cells": [
        "Best Sellers"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.click_category(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he is able to \"Bestsellers\" Text on the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.he_is_able_to_Text_on_the_next_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he is able  to Add product on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_And_add_product_to_cart.he_is_able_to_Add_product_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/feature/Run_product_into_searchbar.feature");
formatter.feature({
  "name": "To search any product from the searchabar and can purchase it",
  "description": "         In order to check that user can enter any product in the search bar \n         and can purchase from them",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Enter the item name in the search bar and can purchase from there",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the search bar page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the item name \"\u003cshoes\u003e\" in the search bar and click search",
  "keyword": "When "
});
formatter.step({
  "name": "item should display and",
  "keyword": "Then "
});
formatter.step({
  "name": "user should able to add it to cart",
  "keyword": "And "
});
formatter.step({
  "name": "Select the address where user want to deleiver",
  "keyword": "And "
});
formatter.step({
  "name": "purchase it after payment perform succesfull",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "shoes"
      ]
    },
    {
      "cells": [
        "shoes"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Enter the item name in the search bar and can purchase from there",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the search bar page",
  "keyword": "Given "
});
formatter.match({
  "location": "Searched_item_to_cart.user_is_on_the_search_bar_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the item name \"shoes\" in the search bar and click search",
  "keyword": "When "
});
formatter.match({
  "location": "Searched_item_to_cart.user_enter_the_item_name_in_the_search_bar_and_click_search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "item should display and",
  "keyword": "Then "
});
formatter.match({
  "location": "Searched_item_to_cart.item_should_display_and()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to add it to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Searched_item_to_cart.user_should_able_to_add_it_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the address where user want to deleiver",
  "keyword": "And "
});
formatter.match({
  "location": "Searched_item_to_cart.select_the_address_where_user_want_to_deleiver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "purchase it after payment perform succesfull",
  "keyword": "And "
});
formatter.match({
  "location": "Searched_item_to_cart.purchase_it_after_payment_perform_succesfull()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});