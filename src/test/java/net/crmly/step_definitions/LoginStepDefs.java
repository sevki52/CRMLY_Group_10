package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import net.crmly.utilities.ConfigurationReader;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // this step handle on the Hooks Class
    }

    @Given("the user enters username")
    public void the_user_enters_username() {

        loginPage.usernameBox.sendKeys(ConfigurationReader.get("username"));
    }

    @Given("the user enters password")
    public void the_user_enters_password() {

        loginPage.passwordBox.sendKeys(ConfigurationReader.get("password"));
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {

        loginPage.loginBtn.click();
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        String expectedTitle = "Portal";
        Assert.assertEquals(expectedTitle,loginPage.getActualTitle());
    }
}
