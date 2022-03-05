package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }


    public String getActualTitle(){

        String title = Driver.get().getTitle();
        String[] actualTitleList = title.split("\\)");
        String actualTitle = actualTitleList[1].trim();
        return actualTitle;
    }

    public void selectAllDepartments(String departmentName){

        Driver.get().findElement(By.xpath("//div[@rel='"+departmentName+": All department and subdepartment employees']/preceding-sibling::div")).click();
    }

    public void selectContact(String contactName){

        Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department']//*[.='"+contactName+"']")).click();
    }

}
