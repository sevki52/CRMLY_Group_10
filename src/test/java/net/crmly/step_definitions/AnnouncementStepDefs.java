package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.AnnouncementPage;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AnnouncementStepDefs {


    @Given("the user clicks {string} tab")
    public void the_user_clicks_tab(String string) {
       new AnnouncementPage().moreButton.click();
    }

    @Then("the user select dropdown {string}")
    public void the_user_select_dropdown(String string) {
        new AnnouncementPage().announcement.click();
    }

    @Given("the user is on the {string} page")
    public void the_user_is_on_the_page(String string) {
     new AnnouncementPage().moreButton.click();
     new AnnouncementPage().announcement.click();
    }



    @When("the user clicks the {string} icon")
    public void the_user_clicks_the_icon(String string) {

        new AnnouncementPage().uploadIcon.click();
    }

    @When("the user clicks the Upload files and images button and selects the file")
    public void the_user_clicks_the_Upload_files_and_images_button_and_selects_the_file() {

        new AnnouncementPage().uploadFilesBtn.click();
    }

    @Then("the user should be able to upload the {string} files")
    public void the_user_should_be_able_to_upload_the_files(String string) {

        WebElement chooseFile = new AnnouncementPage().uploadedFile;
        String textfile = new AnnouncementPage().uploadFilesBtn.getText();


    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String string) {


        new AnnouncementPage().addMore.click();
    }

    @Then("the user click {string} button")
    public void the_user_click_button(String string) {


        new AnnouncementPage().employeesDepartmentsButton.click();
    }


    @Then("the user clicks {string} button")
    public void the_user_clicks_button(String string) {

        new AnnouncementPage().allEmployees.click();
    }



    @Then("the user click {string}")
    public void the_user_click(String string) {

        new AnnouncementPage().linkIcon.click();

    }

    @Then("the user write text into to link text")
    public void the_user_write_text_into_to_link_text() {

        new AnnouncementPage().linkText.sendKeys("message");

    }

    @Then("the user should be click {string}")
    public void the_user_should_be_click(String string) {

        new AnnouncementPage().insertVideoIcon.click();

    }

    @Then("the user should be insert video")
    public void the_user_should_be_insert_video() {

        new AnnouncementPage().videoSource.sendKeys("htpps://cydeo.com");


    }



    @Then("the user write text into to quote text")
    public void the_user_write_text_into_to_quote_text() {

        new AnnouncementPage().quoteText.click();
        new AnnouncementPage().quoteInsert.sendKeys("writing");
    }


    @Then("the user should be able see  quote text")
    public void the_user_should_be_able_see_quote_text() {

        WebElement quotetext= new AnnouncementPage().quoteText;
        Assert.assertTrue(quotetext.isDisplayed());
    }

    @When("the user clicks the \"Add mention\"icon")
    public void the_user_clicks_the_Add_mention_icon() {

        new AnnouncementPage().addMentionIcon.click();
    }

    @Then("the user should be able see add contact list")
    public void the_user_should_be_able_see_add_contact_list() {


        WebElement addContacts = new AnnouncementPage().addContacts;
        Assert.assertTrue(addContacts.isDisplayed());
    }
    @Then("the user should be able to send message")
    public void the_user_should_be_able_to_send_message() {

        Driver.get().switchTo().parentFrame();
        new AnnouncementPage().sendButton.click();

    }


    @Then("the user should be able to write message on the message box")
    public void the_user_should_be_able_to_write_message_on_the_message_box() {

        WebElement messageBox = new AnnouncementPage().messageBox;
        Assert.assertTrue(messageBox.isDisplayed());
    }

}