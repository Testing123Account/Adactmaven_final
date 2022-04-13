$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Practice",
  "description": "",
  "id": "adactin-practice",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-practice;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is launching the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is entering the \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is entering the \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user click the login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "adactin-practice;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "adactin-practice;login-functionality;;1"
    },
    {
      "cells": [
        "TestingAccount",
        "Password"
      ],
      "line": 12,
      "id": "adactin-practice;login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 184574700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-practice;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is launching the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is entering the \"TestingAccount\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is entering the \"Password\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_DefinitionAdactin.user_is_launching_the_browser()"
});
formatter.result({
  "duration": 3825368500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestingAccount",
      "offset": 22
    }
  ],
  "location": "Step_DefinitionAdactin.user_is_entering_the_in_the_username_field(String)"
});
formatter.result({
  "duration": 244733399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 22
    }
  ],
  "location": "Step_DefinitionAdactin.user_is_entering_the_in_the_password_field(String)"
});
formatter.result({
  "duration": 97597401,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_click_the_login_button()"
});
formatter.result({
  "duration": 1071715700,
  "status": "passed"
});
formatter.after({
  "duration": 149900,
  "status": "passed"
});
formatter.before({
  "duration": 182300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search hotel page",
  "description": "",
  "id": "adactin-practice;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "The user is directed to search hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "the user is selecting the location from the location dropdown menu",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the user is selecting the  hotel from the hotel dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the user is selecting the type of the room from the roomtype dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the user is selecting the number of rooms from the number of rooms dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the user is entering the CheckInDate in the Checkin Date field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the user is entering the CheckOutDate in the CheckOutDate field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "the user is choosing the adult counting from the Adultperroom dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "the user is choosing the  Children counting from the Childrenperroom dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "the user is clicking the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_directed_to_search_hotel_page()"
});
formatter.result({
  "duration": 22200,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_selecting_the_location_from_the_location_dropdown_menu()"
});
formatter.result({
  "duration": 479668200,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_selecting_the_hotel_from_the_hotel_dropdown_menu()"
});
formatter.result({
  "duration": 137768100,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_selecting_the_type_of_the_room_from_the_roomtype_dropdown_menu()"
});
formatter.result({
  "duration": 134248000,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_selecting_the_number_of_rooms_from_the_number_of_rooms_dropdown_menu()"
});
formatter.result({
  "duration": 138251600,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_entering_the_CheckInDate_in_the_Checkin_Date_field()"
});
formatter.result({
  "duration": 78573300,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_entering_the_CheckOutDate_in_the_CheckOutDate_field()"
});
formatter.result({
  "duration": 73072801,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_choosing_the_adult_counting_from_the_Adultperroom_dropdown_menu()"
});
formatter.result({
  "duration": 144466300,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_choosing_the_Children_counting_from_the_Childrenperroom_dropdown_menu()"
});
formatter.result({
  "duration": 183361300,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_clicking_the_search_button()"
});
formatter.result({
  "duration": 709019900,
  "status": "passed"
});
formatter.after({
  "duration": 83900,
  "status": "passed"
});
formatter.before({
  "duration": 79801,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Select hotel page",
  "description": "",
  "id": "adactin-practice;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "The user is directed to the select hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "the user is clicking the radio button of select hotel",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "the user is clicking the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_directed_to_the_select_hotel_page()"
});
formatter.result({
  "duration": 24600,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_clicking_the_radio_button_of_select_hotel()"
});
formatter.result({
  "duration": 97858300,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_clicking_the_continue_button()"
});
formatter.result({
  "duration": 759383700,
  "status": "passed"
});
formatter.after({
  "duration": 85900,
  "status": "passed"
});
formatter.before({
  "duration": 185699,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Book a hotel page",
  "description": "",
  "id": "adactin-practice;book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "the user is directed to the book a hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "the user is entering the Firstname of the user in the firstname field",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "the user is entering the Lastname  of the user in the Lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "the user is enetring the BillingAddress in the Billing Address field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "the user is entering  the Credit card no of the user in the field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "the user is choosing the \"\u003cMonth\u003e\"and the \"\u003cyear\u003e\" of the expiry date from the dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "the user is entering teh \"\u003cCVVno\u003e\" in the required field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "the user is clicking the Booknow button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_directed_to_the_book_a_hotel_page()"
});
formatter.result({
  "duration": 23000,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_entering_the_Firstname_of_the_user_in_the_firstname_field()"
});
formatter.result({
  "duration": 304831500,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_entering_the_Lastname_of_the_user_in_the_Lastname_field()"
});
formatter.result({
  "duration": 102261701,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_enetring_the_BillingAddress_in_the_Billing_Address_field()"
});
formatter.result({
  "duration": 108302600,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_entering_the_Credit_card_no_of_the_user_in_the_field()"
});
formatter.result({
  "duration": 146843500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cMonth\u003e",
      "offset": 26
    },
    {
      "val": "\u003cyear\u003e",
      "offset": 43
    }
  ],
  "location": "Step_DefinitionAdactin.the_user_is_choosing_the_and_the_of_the_expiry_date_from_the_dropdown_menu(String,String)"
});
formatter.result({
  "duration": 275536800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cCVVno\u003e",
      "offset": 26
    }
  ],
  "location": "Step_DefinitionAdactin.the_user_is_entering_teh_in_the_required_field(String)"
});
formatter.result({
  "duration": 73776900,
  "status": "passed"
});
formatter.match({
  "location": "Step_DefinitionAdactin.the_user_is_clicking_the_Booknow_button()"
});
formatter.result({
  "duration": 1047459000,
  "status": "passed"
});
formatter.after({
  "duration": 66300,
  "status": "passed"
});
});