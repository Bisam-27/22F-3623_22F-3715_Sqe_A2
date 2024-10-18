Feature: Instagram Login
  Scenario: Successful Instagram Login with valid credentials
    Given The user is on the Instagram login page
    When The user enters username "your username" and password "your password"
    And The user clicks the login button
    Then The user should be logged in successfully
=======
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d

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
<<<<<<< HEAD
>>>>>>> bisam
=======
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d
