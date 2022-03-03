package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import net.crmly.pages.TaskPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;

public class TaskStepDefs {
    TaskPage taskPage = new TaskPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the Home page")
    public void the_user_is_on_the_Home_page() {
        loginPage.login();

    }

    @When("the user clicks on Filter and search")
    public void the_user_clicks_on_Filter_and_search() {

        taskPage.filterSearchBtn.click();
    }
    @Then("the user see default filters")
    public void the_user_see_default_filters(List<String> expectedFilters) {
        BrowserUtils.waitFor(3);
        for (int i = 0; i < expectedFilters.size(); i++) {
            Assert.assertEquals(expectedFilters.get(i),taskPage.actualFilters.get(i).getText().trim());

        }
    }

    @When("the user clicks Add field button")
    public void the_user_clicks_Add_field_button() {
        taskPage.addFieldBtn.click();

    }

    @And("the user chooses some fields")
    public void the_user_chooses_some_fields() {
        BrowserUtils.waitFor(2);
        taskPage.dateBtn.click();
       BrowserUtils.waitFor(2);
       taskPage.typeBtn.click();
    }
    @And("the user removes some fields")
    public void the_user_removes_some_fields() {
        BrowserUtils.waitFor(2);
        taskPage.dateBtn.click();
        BrowserUtils.waitFor(2);
        taskPage.typeBtn.click();
    }

    @Then("chosen fields displayed on Add fields area")
    public void chosen_fields_displayed_on_Add_fiels_area() {

        Assert.assertFalse("Date not selected",taskPage.dateBtn.isSelected());
        Assert.assertFalse("Type not selected",taskPage.typeBtn.isSelected());
    }



}



