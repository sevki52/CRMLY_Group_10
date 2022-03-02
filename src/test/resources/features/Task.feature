Feature: Task Features

  Background: the user log in home page successfully
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button
    Then the user should be able to login

    Scenario: Verify to see default filters as "my activity, work, favorite, announcements, and workflows"
      Given the user is on the Home page
      When the user clicks on Filter and search
      Then the user see default "<filters>"
        | filters       |
        | my activity   |
        | work          |
        | favourite     |
        | announcements |
        | workflows     |