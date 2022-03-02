Feature: Login page features


  Background:

  Scenario: the user should able to login with valid credentials
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button
    Then the user should be able to login
