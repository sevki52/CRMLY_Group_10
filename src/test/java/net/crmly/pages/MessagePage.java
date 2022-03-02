package net.crmly.pages;

import net.crmly.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends BasePage {

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadIcon;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesBtn;

    @FindBy(className = "f-wrap")
    public WebElement uploadedFile;

    public void uploadFile(){

        String projectPath = System.getProperty("user.dir");
        uploadFilesBtn.sendKeys(projectPath+"/src/test/resources/testfile.txt");
    }
}
