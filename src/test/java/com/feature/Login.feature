Feature: Adactin Practice


Scenario Outline: Login Functionality
Given user is launching the browser
When user is entering the "<username>" in the username field
And user is entering the "<password>" in the password field
Then the user click the login button

Examples:
|username|password|
|TestingAccount|Password|




Scenario: Search hotel page
Given The user is directed to search hotel page
When the user is selecting the location from the location dropdown menu 
And the user is selecting the  hotel from the hotel dropdown menu
And the user is selecting the type of the room from the roomtype dropdown menu
And the user is selecting the number of rooms from the number of rooms dropdown menu
And the user is entering the CheckInDate in the Checkin Date field
And the user is entering the CheckOutDate in the CheckOutDate field
And the user is choosing the adult counting from the Adultperroom dropdown menu
And the user is choosing the  Children counting from the Childrenperroom dropdown menu
Then the user is clicking the search button


Scenario: Select hotel page
Given The user is directed to the select hotel page
When the user is clicking the radio button of select hotel 
Then the user is clicking the continue button

Scenario: Book a hotel page
Given the user is directed to the book a hotel page
When the user is entering the Firstname of the user in the firstname field
And the user is entering the Lastname  of the user in the Lastname field
And the user is enetring the BillingAddress in the Billing Address field
And the user is entering  the Credit card no of the user in the field   
And the user is choosing the "<Month>"and the "<year>" of the expiry date from the dropdown menu
And the user is entering teh "<CVVno>" in the required field
Then the user is clicking the Booknow button
   