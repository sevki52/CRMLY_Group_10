
Feature: Message features

  Background: the user logged successfully
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button

  @CRMLYEUG-928
  Scenario: US-917_TC-01.1 Verify that the user should be able to upload files from local disks
    Given the user clicks "Message" tab
    And the user clicks the "Upload files" icon
    When the user clicks the Upload files and images button and selects the file
    Then the user should be able to upload the "testfile.txt" files

  @CRMLYEUG-929
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

  @CRMLYEUG-930
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

  @CRMLYEUG-931
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

  @CRMLYEUG-932
  Scenario: US-917_TC-04.1 Verify that the user should be able to insert videos
    Given the user clicks "Message" tab
    And the user clicks the "Insert video" icon
    When the user enters "https://www.youtube.com/watch?v=aazMMhTBbac" url to the urlBox
    Then the user should be able to insert video

  @CRMLYEUG-933
  Scenario: US-917_TC-05.1 Verify that the user should be able to create a quote
    Given the user clicks "Message" tab
    And the user clicks the "Quote text" icon
    When the user enters "Test2022" to the quote box
    Then the user should be able to create a quote as a "Test2022"

  @CRMLYEUG-934
  Scenario: US-917_TC-06.1 Verify that the user should be able to add mention
    Given the user clicks "Message" tab
    And the user clicks the "Add mention" icon
    And the user clicks the Employees and departments contact lists
    And the user clicks the "Accounting"
    When the user clicks the contact
    Then the user should be able to add mention as a "helpdesk17@cybertekschool.com"

  @CRMLYEUG-935 @smoke
  Scenario: US-917_TC-07.1 Verify that the user should be able to send a message
    Given the user clicks "Message" tab
    And the user enters "Test-2022" to the text box
    When the user clicks the Send button
    Then the user should be able to send a "Test-2022" message

  @CRMLYEUG-936
  Scenario: US-917_TC-07.2 Verify that the user should NOT be able to send a message without Title -(Negative)
    Given the user clicks "Message" tab
    When the user clicks the Send button
    Then the user should be NOT able to send a message without title and displayed following message
      | The message title is not specified |