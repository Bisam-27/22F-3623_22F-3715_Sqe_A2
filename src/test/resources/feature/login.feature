Feature: Instagram Login

  Scenario: Successful Instagram Login with valid credentials
    Given The user is on the Instagram login page
    When The user enters username "your username" and password "your password"
    And The user clicks the login button
    Then The user should be logged in successfully

  Scenario: Unsuccessful Instagram Login with invalid credentials
    Given The user is on the Instagram login page
    When The user enters username "invalid_username" and password "invalid_password"
    And The user clicks the login button
    Then The user should see an error message for invalid credentials

  Scenario: Unsuccessful Instagram Login with empty credentials
    Given The user is on the Instagram login page
    When The user enters username "" and password ""
    And The user clicks the login button
    Then The user should see a message for empty credentials
