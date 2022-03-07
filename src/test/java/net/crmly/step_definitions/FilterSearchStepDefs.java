package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import net.crmly.pages.FilterSearchPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FilterSearchStepDefs {
    FilterSearchPage filterSearchPage = new FilterSearchPage();
    LoginPage loginPage = new LoginPage();
    WebDriver driver;

    //@CRMLYEUG-919
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
            Assert.assertEquals(expectedFilters.get(i), filterSearchPage.actualFilters.get(i).getText().trim());

        }
    }

    //@CRMLYEUG-920
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

        Assert.assertFalse("Date not selected", filterSearchPage.dateBtn.isSelected());
        Assert.assertFalse("Type not selected", filterSearchPage.typeBtn.isSelected());
    }

    //@CRMLYEUG-922
    @When("the user clicks date button.")
    public void the_user_clicks_date_button() {
        BrowserUtils.waitFor(3);
        filterSearchPage.dateSearchBtn.click();
    }

    @And("the user clicks date button {string}")
    public void the_user_clicks_date_button(String dateSearchBtn) {
        BrowserUtils.waitFor(3);
        filterSearchPage.yesterdayDate.click();
        BrowserUtils.waitFor(3);

    }

    @And("the user clicks date button Current day")
    public void the_user_clicks_date_button_Current_day() {
        filterSearchPage.currentDayDate.click();
    }

    @And("the user clicks search button")
    public void the_user_clicks_search_button() {
        filterSearchPage.searchBtn.click();

    }

    @Then("the user should see the {string} post")
    public void the_user_should_see_the_post(String expectedDate) {
        BrowserUtils.waitFor(3);
        List<String> elementsText = BrowserUtils.getElementsText(filterSearchPage.ActualDate);
        for (String s : elementsText) {
            Assert.assertTrue(s.contains(expectedDate));
            System.out.println("expectedDate = " + expectedDate);
        }

    }

    @When("the user clicks Type button")
    public void the_user_clicks_Type_button() {
        filterSearchPage.typeSearchBtn.click();
    }

    @And("the user chooses one or some Types")
    public void the_user_chooses_one_or_some_Types() {
        BrowserUtils.waitFor(2);
        filterSearchPage.workReportsBtn.click();
        BrowserUtils.waitFor(5);
        filterSearchPage.pollsBtn.click();
        BrowserUtils.waitFor(5);
    }

    @Then("the user should be able to see chosen Type")
    public void the_user_should_be_able_to_see_chosen_Type() {
        Assert.assertTrue(filterSearchPage.wr_Btn.isDisplayed());
        Assert.assertTrue(filterSearchPage.PL_Btn.isDisplayed());
    }

    //    @CRMLYEUG-923
    @And("the user clicks Save filter button")
    public void the_user_clicks_Save_filter_button() {
        filterSearchPage.saveFilterBtn.click();
    }

    @And("the user writes a new filter")
    public void the_user_writes_a_new_filter() {
        filterSearchPage.filterName.sendKeys("Work reports");
    }

    @And("the user clicks the save button")
    public void the_user_clicks_the_save_button() {
        filterSearchPage.saveBtn.click();
    }

    @Then("the user see new filters list")
    public void the_user_see_new_filters_list(List<String> expectedFilters) {
        BrowserUtils.waitFor(3);
        for (int i = 0; i < expectedFilters.size(); i++) {
            Assert.assertEquals(expectedFilters.get(i), filterSearchPage.actualFilters.get(i).getText().trim());

        }
    }
    //@CRMLYEUG-924
    @When("the user deletes one field")
    public void the_user_deletes_one_field() {
        filterSearchPage.dateBtn.click();
    }

    @And("the user clicks Restore default fields button")
    public void the_user_clicks_Restore_default_fields_button() {
        filterSearchPage.restoreBtn.click();

    }
    @Then("the user should see the Restore default field")
    public void the_user_should_see_the_Restore_default_field() {
        Assert.assertTrue(filterSearchPage.restoreBtn.isDisplayed());

    }


}



