Feature: Message features

  Background: the user logged successfully
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button

  Scenario: US-917_TC-01.1 Verify that the user should be able to upload files from local disks
    Given the user clicks "Message" tab
    And the user clicks the "Upload files" icon
    When the user clicks the Upload files and images button and selects the file
    Then the user should be able to upload the "testfile.txt" files


  Scenario Outline: US-917_TC-02.1 Verify that the user should be able to add users from Employees and departments lists <departmentName>
    Given the user clicks "Message" tab
    And the user clicks the Add more button
    And the user clicks the Employees and departments contact lists
    And the user clicks the "<departmentName>"
    When the user selects the All department and subdepartment employees option of the "<departmentName>" department
    Then the user should be able to add the "<departmentName>" contact list
    Examples:
      | departmentName |
      | Accounting     |
      | dd             |
      | Ghan           |
      | Marketing Test |


  Scenario Outline: US-917_TC-03.1 Verify that the user should be able to attach link
    Given the user clicks "Message" tab
    And the user clicks the "Link" icon
    And the user enters "<linkName>" to the "text"
    And the user enters "<link>" to the "href"
    When the user click the save button
    Then the user should be able to see the "<linkName>" link
    Examples:
      | linkName |  | link                    |
      | google   |  | https://www.google.com/ |
      | amazon   |  | https://www.amazon.com/ |


  Scenario Outline: US-917_TC-03.2 Verify that the user should NOT be able to attach with empty link (Negative)
    Given the user clicks "Message" tab
    And the user clicks the "Link" icon
    And the user enters "<linkName>" to the "text"
    And the user enters "<emptyLink>" to the "href"
    When the user click the save button
    Then the user should be NOT able to attach link with "<linkName>" with "<emptyLink>"
    Examples:
      | linkName |  | emptyLink |
      | google   |  |           |
      | amazon   |  |           |

  @wip
  Scenario: US-917_TC-04 Verify that the user should be able to insert videos
    Given the user clicks "Message" tab
    And the user clicks the "Insert video" icon
    And the user enters "https://www.youtube.com/watch?v=aazMMhTBbac" url to the urlBox
    When the user click the save button
    Then the user should be able to insert video