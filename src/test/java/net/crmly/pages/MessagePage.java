package net.crmly.pages;

import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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


    public void clickIcon(String iconName){

        if(iconName.equals("Upload files")){
            uploadIcon.click();
        }else {
            Driver.get().findElement(By.xpath("//span[@title='"+iconName+"']")).click();
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

        Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-"+boxName)).sendKeys(text);
    }

    public String  getActualText(String linkName){

        return Driver.get().findElement(By.xpath("//a[.='"+linkName+"']")).getText();
    }

}
