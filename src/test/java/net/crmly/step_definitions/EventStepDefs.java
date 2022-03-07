package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.crmly.pages.EventPage;
import net.crmly.pages.PortalPage;
import org.junit.Assert;

import java.text.ParseException;

public class EventStepDefs {

    @Then("Navigate to Event Tab")
    public void navigateToEventTab() {
        PortalPage portalPage=new PortalPage();
        portalPage.navigateToTab("Event");

    }

    @Given("User enters {string} {string} {string} {string}")
    public void user_enters(String string, String string2, String string3, String string4) {
        EventPage eventPage=new EventPage();
        eventPage.EnterDate(string,string2,string3,string4);

    }


    @Then("Users select time zone")
    public void users_select_time_zone() {
        EventPage eventPage=new EventPage();
        eventPage.TimeZone();
        String actualResult= eventPage.TimeZoneSelection.getAttribute("value");
        System.out.println("actualResult = " + actualResult);
        String expectedResult= eventPage.TimeZoneSelection2.getAttribute("value");
        System.out.println("expectedResult = " + expectedResult);
        Assert.assertTrue(expectedResult.equals(actualResult));
    }

    @Given("User enters invalid {string} {string} {string} {string}")
    public void user_enters_invalid(String string, String string2, String string3, String string4) {
        EventPage eventPage=new EventPage();
        eventPage.EnterDate(string,string2,string3,string4);

    }

    @Then("Verify user can not {string} set Event")
    public void verify_user_can_not_set_Event(String string) throws ParseException {

        EventPage eventPage=new EventPage();
        System.out.println("eventPage.InvalidEnterDate() = " + eventPage.InvalidEnterDate(string));
        Assert.assertTrue(eventPage.InvalidEnterDate(string));

    }


}
