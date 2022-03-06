Feature: User should be able to create poll

  Background:
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button
    Then the user should be able to login
    And the user clicks "Poll" tab

  Scenario:Adding contacts
    And the user clicks to inputBox
    And the user clicks the Add more button
    And the user clicks the Employees and departments contact lists
    And the user selects following departments
      | Accounting |
      | dd         |
    Then the user should be able to select
      | Accounting |
      | dd         |

  Scenario: Attaching a link by clicking on the link icon
    When the user clicks the link button
    And the user enters "link" and "https://cydeo.com/"
    And the user click the save button
    Then the linkText is shown on page
      | linkName | link               |
      | url      | https://cydeo.com/ |

  @wip
  Scenario: