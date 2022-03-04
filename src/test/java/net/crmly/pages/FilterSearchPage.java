package net.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterSearchPage extends BasePage {

    @FindBy(xpath = "(//*[@id=\"LIVEFEED_search_container\"])[1]")
    public WebElement filterSearchBtn;

    @FindBy(xpath = "//*[@class='main-ui-filter-sidebar-item']")
    public List<WebElement> actualFilters;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addFieldBtn;

    @FindBy(xpath = "//div[contains(text(),'Date')]")
    public WebElement dateBtn;

    @FindBy(xpath = "//div[contains(text(),'Type')]")
    public WebElement typeBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[2]/span[2]")
    public WebElement restoreBtn;

    @FindBy(xpath = "//div[@class='main-ui-control-field']")
    public WebElement dateSearchBtn;



}
