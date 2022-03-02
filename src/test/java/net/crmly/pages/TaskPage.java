package net.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TaskPage extends BasePage {

    @FindBy(xpath = "(//*[@id=\"LIVEFEED_search_container\"])[1]")
    public WebElement filterSearchBtn;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item-container']")
    public List<WebElement> expectedFilters;

}
