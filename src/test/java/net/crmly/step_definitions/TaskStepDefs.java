package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.TaskPage;

public class TaskStepDefs {
 TaskPage taskPage = new TaskPage();
    @Given("the user is on the Home page")
    public void the_user_is_on_the_Home_page() {

    }

    @When("the user clicks on Filter and search")
    public void the_user_clicks_on_Filter_and_search() {

    }

    @Then("the user see default {string}")
    public void the_user_see_default(String string, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }


}
