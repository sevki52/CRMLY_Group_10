package net.crmly.pages;

import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class MessagePage extends BasePage {

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadIcon;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesBtn;

    @FindBy(className = "f-wrap")
    public WebElement uploadedFile;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMore;

    @FindBy(xpath = "//div[@class='bx-finder-box-tabs']//a[2]")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//div[@class='bx-finder-company-department']//*[.='Accounting']")
    public WebElement accounting;

    @FindBy(xpath = "//div[@rel='Accounting: All department and subdepartment employees']/preceding-sibling::div")
    public WebElement allDepartmet;

    @FindBy(className = "feed-add-post-destination-text")
    public List<WebElement> addedContacts;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkBox;

    @FindBy(id = "undefined")
    public WebElement saveBtn;

    @FindBy(xpath = "//body[@class='vsc-initialized']//a")
    public WebElement actualText;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceBox;

    @FindBy(className = "bxhtmled-video-error")
    public WebElement errorMsg;

    @FindBy(className = "bxhtmled-quote")
    public WebElement actualQuoteMsg;

    @FindBy(xpath = "//div[@id='bx-lm-category-relation-150']//div[@class='bx-finder-company-department-employee-name']")
    public WebElement quoteOfContact;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(className = "feed-post-text-block-inner-inner")
    public List<WebElement> messages;

    @FindBy(className = "feed-add-info-text")
    public WebElement errorMessage;

    @FindBy(className = "bxhtmled-metion")
    public WebElement actualMention;

    public static String expectedMessage;

    public void clickIcon(String iconName){

        if(iconName.equals("Upload files")){
            uploadIcon.click();
        }else {
            Driver.get().findElement(By.xpath("(//span[@title='"+iconName+"'])[1]")).click();
        }
    }

    public void uploadFile(){

        String projectPath = System.getProperty("user.dir");
        uploadFilesBtn.sendKeys(projectPath+"/src/test/resources/testfile.txt");
    }

    public void selectContact(String contactName){

        Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department']//*[.='"+contactName+"']")).click();
    }

    public void selectAllDepartments(String departmentName){

        Driver.get().findElement(By.xpath("//div[@rel='"+departmentName+": All department and subdepartment employees']/preceding-sibling::div")).click();
    }

    public void enterData(String text, String boxName){

        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-"+boxName)).sendKeys(text);
        BrowserUtils.waitFor(1);
    }

    public String  getActualText(String linkName){

        return Driver.get().findElement(By.xpath("//a[.='"+linkName+"']")).getText();
    }

    public String getActualMsgTxt(){

        return messages.get(0).getText().trim();
    }

    public  String setMessage(String message){

        Random random = new Random();
        int x = random.nextInt();
        expectedMessage = message+""+x;
        return expectedMessage;
    }
}
