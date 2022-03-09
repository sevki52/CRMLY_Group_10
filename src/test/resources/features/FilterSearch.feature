@CRMLYEUG-926
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

  @CRMLYEUG-920 @smoke
  Scenario: Verify to add and remove field.
    Given the user is on the Home page
    When the user clicks on Filter and search
    And the user clicks Restore default fields button
    And the user clicks Add field button
    And the user chooses some fields
    And the user removes some fields
    Then chosen fields displayed on Add fields area


  @CRMLYEUG-921
  Scenario: Verify to search by selecting Date
    Given the user is on the Home page
    When the user clicks on Filter and search
    And the user clicks date button.
    And the user clicks date button "Yesterday"
    And the user clicks search button
    Then the user should see the "yesterday" post

  @CRMLYEUG-940
  Scenario: Verify to search by selecting Date
    Given the user is on the Home page
    When the user clicks on Filter and search
    And the user clicks date button.
    And the user clicks date button Current day
    And the user clicks search button
    Then the user should see the "today" post

  @CRMLYEUG-922
  Scenario: Verify to search by selecting one or more Type.
    Given the user is on the Home page
    When the user clicks on Filter and search
    And the user clicks Restore default fields button
    And the user clicks Type button
    And the user chooses one or some Types
    Then the user should be able to see chosen Type

  @CRMLYEUG-923
  Scenario: Verify to save filter
    Given the user is on the Home page
    When the user clicks on Filter and search
    And the user clicks Save filter button
    And the user writes a new filter
    And the user clicks the save button
    Then the user see new filters list
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
      | WORK REPORTS  |
    And the user clicks Configure filter button
    And the user deletes added filter
    And the user clicks the save button

  @CRMLYEUG-924
  Scenario: Verify to restore default field
    Given the user is on the Home page
    When the user clicks on Filter and search
    And the user clicks Add field button
    And the user deletes one field
    And the user adds one field
    And the user clicks Restore default fields button
    Then the user should see the Restore default field

  @CRMLYEUG-925
  Scenario: Verify to reset filters to default.
    Given the user is on the Home page
    When the user clicks on Filter and search
    And the user clicks Save filter button
    And the user writes a new filter
    And the user clicks the save button
    And the user clicks Configure filter button
    And the user deletes added filter
    And the user clicks the save button
    Then the user see default filters
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |














