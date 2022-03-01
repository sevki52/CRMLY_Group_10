package net.crmly.pages;

import net.crmly.utilities.Driver;
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

}
