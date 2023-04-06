Feature: Application Login

Scenario: Homfe Page Default Login
Given User is on landing Page
When User Login into application with username and password
Then Home page is populated
And Cards are displayed

Scenario: Home Page Default Login for user1
Given User is on landing Page
When User Login into application with "john1" and "1234"
Then Home page is populated
And Cards are displayed

Scenario: Home Page Default Login for user2
Given User is on landing Page
When User Login into application with "john2" and "12345"
Then Home page is populated
And Cards are not displayed

Scenario: Home Page Default Login for user3
Given User is on landing Page
When User Login into application with "john1" and "1234"
Then Cards displayed = "true"

@RegressionTest
Scenario: Home Page Default Login for user4
Given User is on landing Page
When User Login into application with "john2" and "12345"
Then Cards displayed = "false"

Scenario: Home Page Default Login for user5 with data table for test data driven
Given User is on landing Page
When User Login into application with following details
|ank |123|anki@gmail| bhopal|461775|
Then Cards displayed = "True"

Scenario Outline: Parametrizing(Repeat test case with different test data sets) test run with example keyword
Given User is on landing Page
When Login into application by <username> and password <password>
Then Home page is populated


Examples: 

|username | password  |
| anki1    |  qwerty   |
| anki2    |  qwert    |
| anki3    |  fcgvhjk  |
| anki4    |  gvhj     |
