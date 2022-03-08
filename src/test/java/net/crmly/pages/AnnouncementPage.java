package net.crmly.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnouncementPage extends BasePage {



    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//body/div[@id='menu-popup-feed-add-post-form-popup']/div[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div[1]/div[1]/span[3]/span[2]")
    public WebElement announcement;





    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadIcon;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesBtn;

    @FindBy(className = "f-wrap")
    public WebElement uploadedFile;

    public void uploadFile(){

        String projectPath = System.getProperty("user.dir");
        uploadFilesBtn.sendKeys(projectPath+"/src/test/resources/textfile.txt");
    }


    @FindBy(css = "#bx-destination-tag")
    public WebElement addMore;

    @FindBy(xpath = "//a[@href='#switchTab'][2]")
    public WebElement employeesDepartmentsButton;

    @FindBy(xpath = "//span[contains(text(),'All employees')]")
    public WebElement allEmployees;





    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm']")
    public WebElement linkIcon;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkText;

    @FindBy(css = "#undefined")
    public WebElement saveText;



    @FindBy(xpath = "//*[@id=\"bx-b-video-blogPostForm\"]/span")
    public WebElement insertVideoIcon;

    @FindBy(id="video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSource;



    @FindBy(xpath ="//span[@title='Quote text']")
    public WebElement quoteText;

    @FindBy(xpath = "//body/blockquote[1]/blockquote[1]")
    public WebElement quoteInsert;


    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMentionIcon;

    @FindBy(css = "#destDepartmentTab_mention77549175")
    public WebElement addContacts;


    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@id='divoPostFormLHE_blogPostForm']")
    public WebElement messageBox;


}

