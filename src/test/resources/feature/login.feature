Feature: Instagram Login

  Scenario: Successful Instagram Login
    Given The user is on the Instagram login page
    When The user enters username "your_username" and password "your_password"
    And The user clicks the login button
    Then The user should be logged in successfully
