package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.PollPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PollStepDefs {

    PollPage pollPage = new PollPage();

    @Then("the user clicks to inputBox")
    public void the_user_clicks_to_inputBox() {
        Driver.get().findElement(By.xpath("//span[@class='feed-add-post-del-but']")).click();
    }

    @Then("the user selects following departments")
    public void the_user_selects_following_departments(List<String> contacts) {
        for (String contact : contacts) {
            pollPage.selectContact(contact);
            pollPage.selectAllDepartments(contact);
        }
    }

    @Then("the user should be able to select")
    public void the_user_should_be_able_to_select(List<String> expectedContacts) {
        List<String> actualContacts = BrowserUtils.getElementsText(pollPage.actualContactElm);
        Assert.assertEquals(expectedContacts,actualContacts);
    }

    @When("the user clicks the link button")
    public void the_user_clicks_the_link_button() {
        pollPage.linkBtn.click();
    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String text, String url) {
        pollPage.textInputBox.sendKeys(text);
        pollPage.urlInputBox.sendKeys(url);
    }

    @Then("the linkText is shown on page")
    public void the_linkText_is_shown_on_page(Map<String,String> expectedLinkInfo) {
        Driver.get().switchTo().frame(0);
        Map<String,String> actualLinkInfo = new HashMap<>();
        String url = pollPage.sheetElm.getAttribute("href");
        System.out.println("url = " + url);
        String linkTitle = pollPage.sheetElm.getText();
        System.out.println("linkTitle = " + linkTitle);
        actualLinkInfo.put("linkName",linkTitle);
        actualLinkInfo.put("url",url);
        System.out.println("expectedLinkInfo = " + expectedLinkInfo);
        System.out.println("actualLinkInfo = " + actualLinkInfo);
        Assert.assertEquals(expectedLinkInfo,actualLinkInfo);
    }


}
