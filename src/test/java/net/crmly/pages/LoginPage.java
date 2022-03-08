package net.crmly.pages;

import net.crmly.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//body/div[@id='menu-popup-feed-add-post-form-popup']/div[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div[1]/div[1]/span[3]/span[2]")
    public WebElement announcement;




    public void login(){
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginBtn.click();
    }
}
