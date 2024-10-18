Feature: Instagram Search Functionality

  Scenario: Successful Instagram Search after Login
    Given The user is on the Instagram login page
    When The user enters username "your username" and password "your password"
    And The user clicks the login button
    Then The user should be logged in successfully
    When The user clicks the search button
    And The user searches for "bisam ahmad"
    Then The search results should be displayed
