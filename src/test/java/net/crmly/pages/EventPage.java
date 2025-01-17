package net.crmly.pages;

import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EventPage extends BasePage {
    @FindBy (xpath = "//input[@name='DATE_FROM']")
    public WebElement StartDate;

    @FindBy (xpath = "//input[@name='TIME_FROM_']")
    public WebElement StartHour;

    @FindBy (xpath = "//input[@name='DATE_TO']")
    public WebElement EndDate;

    @FindBy (xpath = "//input[@name='TIME_TO_']")
    public WebElement EndHour;

    @FindBy (xpath = "//span[@class='feed-ev-tz-open']")
    public WebElement TimeZoneText;

    @FindBy (xpath = "//select[@name='TZ_FROM']")
    public WebElement TimeZoneSelection;

    Select timezone=new Select(TimeZoneSelection);
    List<WebElement> options = timezone.getOptions();

    @FindBy (xpath = "//select[@name='TZ_TO']")
    public WebElement TimeZoneSelection2;

    @FindBy(css = ".feed-event-rem-ch")
    public WebElement SetReminder;

    @FindBy(css = "#event-remind_countcal_3Jcl")
    public WebElement SetReminderTime;

    @FindBy(css = "#event-remind_typecal_3Jcl")
    public WebElement  SetReminderTime1;
    Select select=new Select(SetReminderTime1);
    List<WebElement> selection= select.getOptions();

        public void EnterDate(String Date1, String Time1,String Date2,String Time2){
            StartDate.clear();      StartDate.sendKeys(Date1);
            StartHour.clear();      StartHour.sendKeys(Time1);

            EndDate.clear(); BrowserUtils.waitFor(2);      EndDate.sendKeys(Date2);
            EndHour.clear();       EndHour.sendKeys(Time2);
        }

        public void TimeZone(){
            TimeZoneText.click();
         options.get(1).click();

        }

        public boolean InvalidEnterDate(String Date1) throws ParseException {


            // Create object of SimpleDateFormat class and decide the format
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
            //get current date time with Date()
            Date date = new Date();
            // Now format the date
            String date1= dateFormat.format(date);
            Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date1);
            // Print the Date
            String sDate1=Date1;
            BrowserUtils.waitFor(3);
            Date date2=new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);

            if (date2.before(date)){
                return false;
            } else{
              return true;
            }


        }
        public void SetReminder(String str1, String str2){
            BrowserUtils.verifyElementDisplayed(SetReminderTime);
                SetReminderTime.clear();
                SetReminderTime.sendKeys(str1);

                if(str2.equalsIgnoreCase("minutes")){
                    selection.get(0).click();

                }else if(str2.equalsIgnoreCase("hours")){
                    selection.get(1).click();
                } else if(str2.equalsIgnoreCase("days")){
                    selection.get(2).click();
                }


        }

        public boolean VerifySetReminder(String str1, String str2){
         boolean s1= SetReminderTime.getAttribute("value").equalsIgnoreCase(str1);
            boolean s2  = select.getFirstSelectedOption().getText().equalsIgnoreCase(str2);
       return s1 & s2;

        }

}
