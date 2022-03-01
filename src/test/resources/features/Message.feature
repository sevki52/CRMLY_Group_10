Feature: Message features

  Background: the user logged successfully
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button
    Then the user should be able to login

  @wip
  Scenario: US-917_TC-001 Verify that the user should be able to upload files from local disks
    Given the user clicks "Message" tab
    And the user clicks the upload files icon
    And the user clicks the Upload files and images button and selects the file
    Then the user should be able to upload the "testfile.txt" files

