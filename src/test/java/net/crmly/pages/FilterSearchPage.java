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


    @FindBy(xpath = "//div[@class='main-ui-control-field']")
    public WebElement dateSearchBtn;


    @FindBy (xpath = "(//div[@class='main-ui-select-inner-item-element'])[2]")
    public WebElement yesterdayDate;

    @FindBy (xpath = "(//div[@class='main-ui-select-inner-item-element'])[3]")
    public WebElement currentDayDate;

    @FindBy(xpath = "//div[@class='main-ui-filter-field-button-inner']//button")
    public WebElement searchBtn;

    @FindBy(className = "feed-time")
    public List<WebElement> ActualDate;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[2]/div[1]")
    public WebElement typeSearchBtn;

    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[8]")
    public WebElement workReportsBtn;

    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[4]")
    public WebElement pollsBtn;

    @FindBy(xpath = "(//span[@class='main-ui-square-item'])[1]")
    public WebElement wr_Btn;

    @FindBy(xpath = "(//span[@class='main-ui-square-item'])[1]")
    public WebElement PL_Btn;

    @FindBy(css=".main-ui-filter-add-item")
    public WebElement saveFilterBtn;

    @FindBy(css=".main-ui-filter-sidebar-edit-control")
    public WebElement filterName;

    @FindBy(css = "span[class*='main-ui-filter-save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreBtn;

    @FindBy(css = "span.main-ui-filter-add-edit")
    public WebElement configurBtn;

    @FindBy(xpath = "(//span[@title=\"Delete filter\"])[8]")
    public WebElement deleteFilterBtn;






}
