Feature: As a user, I should be able to create events by clicking
  on Event tab under Activity Stream

  Background:
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button
    Then the user should be able to login
    Then Navigate to Event Tab

  Scenario: User should be able to add Event start and ending date and time and specify the time zone.
    Given the user is on the login page