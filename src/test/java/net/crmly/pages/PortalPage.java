package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.By;

public class PortalPage extends BasePage{

    public void navigateToTab(String tabName){

        Driver.get().findElement(By.xpath("(//span[.='"+tabName+"'])[2]")).click();
    }
}
