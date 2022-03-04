package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import net.crmly.pages.PortalPage;

public class EventStepDefs {

    @Then("Navigate to Event Tab")
    public void navigateToEventTab() {
        PortalPage portalPage=new PortalPage();
        portalPage.navigateToTab("Event");

    }
}
