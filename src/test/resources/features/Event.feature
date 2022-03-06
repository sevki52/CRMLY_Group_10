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
     Given User enters "03/10/2022" "03:00 pm" "03/10/2022" "05:00 pm"
     Then  Users select time zone


  Scenario: User should be able to add Event start and ending date and time and specify the time zone.
    Given User enters invalid "02/10/2022" "03:00 pm" "02/15/2022" "05:00 pm"
    Then  Verify user can not "02/10/2022" set Event