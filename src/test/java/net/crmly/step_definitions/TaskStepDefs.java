package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.TaskPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;

public class TaskStepDefs {
    TaskPage taskPage = new TaskPage();

    @Given("the user is on the Home page")
    public void the_user_is_on_the_Home_page() {

    }

    @When("the user clicks on Filter and search")
    public void the_user_clicks_on_Filter_and_search() {
        taskPage.filterSearchBtn.click();
    }
   @Then("the user see default {string}")
   public void the_user_see_default(String filter, List<String> expectedFilters) {
      BrowserUtils.waitFor(2);

      List<String> actualFilters= BrowserUtils.getElementsText(new TaskPage().expectedFilters);
      Assert.assertEquals(expectedFilters,actualFilters);
      System.out.println("actualFilters = " + actualFilters);

   }






}
