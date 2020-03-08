Feature: Login in Amazon

Scenario Outline: Open Amazon.in and log in successfully

Given Launch the Browser
Then Enter the URL
And Maximize the Window
Then Click on Sign In
Then Enter Username as "<Username>"
And Enter Password as "<Password>"
Then Log in

Examples:
|Username|Password|
|9748274001|soumi56742| 