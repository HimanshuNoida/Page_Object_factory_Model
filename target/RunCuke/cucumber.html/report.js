$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Amazon_Maps.feature");
formatter.feature({
  "name": "to check user is able to login into Amazon website  and search the prdouct",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@staging"
    }
  ]
});
formatter.scenario({
  "name": "To check if user enter valid username and valid",
  "description": "          password then he  gets sucessfully login to the website",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@staging"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the Homepage  of  the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "List.the_user_is_on_the_Homepage_of_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the valid username and password in the password  field",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "naudiyalhimanshu@gmail.com",
        "Noida@601"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_Maps.user_enter_the_valid_username_and_password_in_the_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  gets sucessfully login into the website",
  "keyword": "Then "
});
formatter.match({
  "location": "List.user_gets_sucessfully_login_into_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able  to see the HomePage of the website",
  "keyword": "And "
});
formatter.match({
  "location": "List.user_able_to_see_the_HomePage_of_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});