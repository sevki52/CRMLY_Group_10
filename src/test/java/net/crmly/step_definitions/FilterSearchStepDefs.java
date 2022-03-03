package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import net.crmly.pages.FilterSearchPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;

public class FilterSearchStepDefs {
    FilterSearchPage filterSearchPage = new FilterSearchPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the Home page")
    public void the_user_is_on_the_Home_page() {
        loginPage.login();

    }

    @When("the user clicks on Filter and search")
    public void the_user_clicks_on_Filter_and_search() {

        filterSearchPage.filterSearchBtn.click();
    }
    @Then("the user see default filters")
    public void the_user_see_default_filters(List<String> expectedFilters) {
        BrowserUtils.waitFor(3);
        for (int i = 0; i < expectedFilters.size(); i++) {
            Assert.assertEquals(expectedFilters.get(i),filterSearchPage.actualFilters.get(i).getText().trim());

        }
    }

    @When("the user clicks Add field button")
    public void the_user_clicks_Add_field_button() {
        filterSearchPage.addFieldBtn.click();

    }

    @And("the user chooses some fields")
    public void the_user_chooses_some_fields() {
        BrowserUtils.waitFor(2);
        filterSearchPage.dateBtn.click();
       BrowserUtils.waitFor(2);
       filterSearchPage.typeBtn.click();
    }
    @And("the user removes some fields")
    public void the_user_removes_some_fields() {
        BrowserUtils.waitFor(2);
        filterSearchPage.dateBtn.click();
        BrowserUtils.waitFor(2);
        filterSearchPage.typeBtn.click();
    }

    @Then("chosen fields displayed on Add fields area")
    public void chosen_fields_displayed_on_Add_fiels_area() {

        Assert.assertFalse("Date not selected",filterSearchPage.dateBtn.isSelected());
        Assert.assertFalse("Type not selected",filterSearchPage.typeBtn.isSelected());
    }
    @When("the user clicks Restore default fields button")
    public void the_user_clicks_Restore_default_fields_button() {
        filterSearchPage.restoreBtn.click();
    }

    @And("the user clicks date button {string}")
    public void the_user_clicks_date_button(String time) {
        BrowserUtils.waitFor(3);
        filterSearchPage.dateSearchBtn.click();
        BrowserUtils.waitFor(10);

    }
    @And("the user clicks search button")
    public void the_user_clicks_search_button() {

    }
    @Then("the user should see the {string} post")
    public void the_user_should_see_the_post(String string) {

    }



}



