package net.crmly.step_definitions;

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

   }



