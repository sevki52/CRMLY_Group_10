package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.crmly.pages.MessagePage;
import net.crmly.pages.PortalPage;
import org.junit.Assert;

public class MessageStepDefs {

    MessagePage mp = new MessagePage();

    @Given("the user clicks {string} tab")
    public void the_user_clicks_tab(String tabName) {

        new PortalPage().navigateToTab(tabName);
    }

    @Given("the user clicks the upload files icon")
    public void the_user_clicks_the_upload_files_icon() {

        mp.uploadIcon.click();
    }

    @Given("the user clicks the Upload files and images button and selects the file")
    public void the_user_clicks_the_Upload_files_and_images_button_and_selects_the_file() {

        mp.uploadFile();
    }

    @Then("the user should be able to upload the {string} files")
    public void the_user_should_be_able_to_upload_the_files(String fileName) {

        Assert.assertEquals("file can NOT be uploaded",fileName,mp.uploadedFile.getText().trim());
    }


}
