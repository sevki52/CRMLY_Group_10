package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.MessagePage;
import net.crmly.pages.PortalPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MessageStepDefs {

    MessagePage mp = new MessagePage();

    @Given("the user clicks {string} tab")
    public void the_user_clicks_tab(String tabName) {

        new PortalPage().navigateToTab(tabName);
    }

    @Given("the user clicks the {string} icon")
    public void the_user_clicks_the_icon(String iconName) {

        mp.clickIcon(iconName);
    }

    @Given("the user clicks the Upload files and images button and selects the file")
    public void the_user_clicks_the_Upload_files_and_images_button_and_selects_the_file() {

        mp.uploadFile();
    }

    @Then("the user should be able to upload the {string} files")
    public void the_user_should_be_able_to_upload_the_files(String fileName) {

        Assert.assertEquals("file can NOT be uploaded",fileName,mp.uploadedFile.getText().trim());
    }

    @Given("the user clicks the Add more button")
    public void the_user_clicks_the_Add_more_button() {

        BrowserUtils.waitFor(2);
        mp.addMore.click();
    }

    @Given("the user clicks the Employees and departments contact lists")
    public void the_user_clicks_the_Employees_and_departments_contact_lists() {
        BrowserUtils.waitFor(2);

        mp.employeesAndDepartments.click();
    }

    @Given("the user clicks the {string}")
    public void the_user_clicks_the(String contactName) {

        mp.selectContact(contactName);
    }

    @When("the user selects the All department and subdepartment employees option of the {string} department")
    public void the_user_selects_the_All_department_and_subdepartment_employees_option_of_the_department(String departmentName) {

        mp.selectAllDepartments(departmentName);
    }

    @When("the user selects the {string} option")
    public void the_user_selects_the_option(String departmentName) {

        mp.selectAllDepartments(departmentName);
    }

    @Then("the user should be able to add the {string} contact list")
    public void the_user_should_be_able_to_add_the_contact_list(String expectedContacts) {

        String actualContact = mp.addedContacts.get(1).getText();
        Assert.assertEquals("contacts does NOT added",expectedContacts,actualContact);
    }

    @Given("the user enters {string} to the {string}")
    public void the_user_enters_to_the(String textName, String boxName) {

        mp.enterData(textName,boxName);
    }

    @When("the user click the save button")
    public void the_user_click_the_save_button() {

        mp.saveBtn.click();
    }
    @Then("the user should be able to see the {string} link")
    public void the_user_should_be_able_to_see_the_link(String expectedLinkName) {

        Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));
        Assert.assertEquals("link does NOT attached",expectedLinkName,mp.getActualText(expectedLinkName));
    }

    @Then("the user should be NOT able to attach link with {string}")
    public void the_user_should_be_NOT_able_to_attach_link_with(String unExpectedLinkName) {

        Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));
        Assert.assertNotEquals("link does NOT attached",unExpectedLinkName,mp.getActualText(unExpectedLinkName));
    }

    @Then("the user should be NOT able to attach link with {string} with {string}")
    public void the_user_should_be_NOT_able_to_attach_link_with_with(String unExpectedLinkName, String emptyLink) {

        Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));
        Assert.assertNotEquals("link attached",unExpectedLinkName,mp.getActualText(unExpectedLinkName));
    }

    @Given("the user enters {string} url to the urlBox")
    public void the_user_enters_url_to_the_urlBox(String url) {

        mp.videoSourceBox.sendKeys(url);
    }

    @Then("the user should be able to insert video")
    public void the_user_should_be_able_to_insert_video() {
        BrowserUtils.waitFor(2);
        Assert.assertFalse("video url does NOT inserted",mp.errorMsg.isDisplayed());


    }



}
