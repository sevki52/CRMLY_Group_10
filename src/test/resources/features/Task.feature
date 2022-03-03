Feature: Task Features

  Background:

  Scenario: the user log in home page successfully
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button
    Then the user should be able to login

  @CRMLYEUG-919
  Scenario: Verify to see default filters as "work, my activity, favorite, announcements, and workflows"
    Given the user is on the Home page
    When the user clicks on Filter and search
    Then the user see default filters
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |

    @CRMLYEUG-920
    Scenario: Verify to add and remove field.
      Given the user is on the Home page
      When the user clicks on Filter and search
      And the user clicks Add field button
      And the user chooses some fields
      And the user removes some fields
      Then chosen fields displayed on Add fields area



