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

    Scenario Outline: User should be able to set a reminder.
      Given User can select set a reminder
      And   User enters "<duration>" and "<time>"
      Then  Verify that user can enter "<duration>" and "<time>"

      Examples:
        | duration  | time     |
        |      20   |  minutes |
        |      2    | hours    |
        |      2    | days     |


      Scenario Outline: User should be able to select event location from the dropdown
      Given Users can select any "<location>"
      Then Veriyf that user select "<location>"
    Examples:
      | location               |
      |   Central Meeting Room |
      |   East Meeting Room    |
      |   West Meeting Room    |


        Scenario Outline: User should be able to add attendees by selecting contacts individually or adding groups and departments.
          Given Users can add "<person>" "<departments>"
          Then Verify that selected "<person>" "<departments>"
          Examples:
            | person                | departments  |
            |hr28@cybertekschool.com| Accounting   |
            |hr80@cybertekschool.com| Support      |
