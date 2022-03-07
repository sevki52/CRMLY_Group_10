package net.crmly.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PollPage extends BasePage {

    @FindBy(className = "feed-add-post-destination-text")
    public List<WebElement> actualContactElm;

    @FindBy(css = "span[title='Link']")
    public WebElement linkBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textInputBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement urlInputBox;

    @FindBy(xpath = "//body[@contenteditable]/a")
    public WebElement sheetElm;


}
