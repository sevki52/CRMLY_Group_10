Feature: CRMLYEUG-910 Announcement features

  Background: the user logged successfully
    Given the user is on the login page
    And the user enters username
    And the user enters password
    When the user clicks the login button
    Then the user should be able to login



    Scenario: Announcement page
     Given the user is on the login page
    Then the user clicks "More" tab
    Then the user select dropdown "Announcement"




  Scenario: Upload Files Icon
    Given the user is on the "Announcement" page
    When the user clicks the "Upload files" icon
    And the user clicks the Upload files and images button and selects the file
    Then the user should be able to upload the "textfile.txt" files

@smoke
    Scenario: All employees
      Given the user is on the "Announcement" page
      When the user clicks the "Add more" button
     Then the user clicks "All employees" button



      Scenario: Link Icon
        Given the user is on the "Announcement" page
        When the user clicks the "Link" icon
        Then the user click "Link text"
        And the user write text into to link text




       Scenario: Insert Video Icon
       Given the user is on the "Announcement" page
         When the user clicks the "Insert video" icon
        Then the user should be click "Video source"
         Then the user should be insert video


      Scenario: Quote Text
        Given the user is on the "Announcement" page
        When the user clicks the "Quote text" icon
        Then the user should be able see  quote text

        
        Scenario: Add mention Icon
          Given the user is on the "Announcement" page
          When the user clicks the "Add mention" icon
          Then the user should be able see add contact list


          Scenario: Send Button
            Given the user is on the "Announcement" page
            When the user clicks the "SEND" button
            Then the user should be able to write message on the message box


 

