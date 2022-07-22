package com.syntax.Class05;

import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Tc1 {
   /* TC 1: Facebook dropdown verification
    Open chrome browser,  Go to “https://www.facebook.com”
    click on create new account
    Verify:
    month dd has 12 month options,
    day dd has 31 day options
    year dd has 115 year options,
    Select your date of birth,
    Quit browser  */

    public static String url= "https://www.facebook.com ";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver ();
        driver.get ( url );
        Thread.sleep(2000);

        WebElement CreateANewAccount=driver.findElement ( By.linkText ( "Create new account" ) );
        CreateANewAccount.click ();
        Thread.sleep(2000);

        WebElement MountDD = driver.findElement(By.id ("month"));
        Select s1 = new Select(MountDD);
        List<WebElement> listMonth=s1.getOptions ();
            if (listMonth.size ()==12) {
                System.out.println ( "Month has 12 options" );
            }else {
                System.out.println ( "Mount does not have 12 options" );
            }
        WebElement dayDD = driver.findElement(By.id ("day"));
        Select s2 = new Select(dayDD);
        List<WebElement> listDayDD=s1.getOptions ();
        if (listMonth.size ()==31) {
            System.out.println ( "Day has 31 options" );
        }else {
            System.out.println ( "Day does not have 31 options" );
        }
        WebElement yearDD = driver.findElement(By.id ("year"));
        Select s3 = new Select(yearDD);
        List<WebElement> listyearDD=s1.getOptions ();
        if (listMonth.size ()==115) {
            System.out.println ( "Year has 115 options" );
        }else {
            System.out.println ( "Day does not have 115 options" );
        }
        s1.selectByVisibleText("Oct");
        s2.selectByValue("28");
        s3.selectByValue("1965");
        Thread.sleep(2000);
        //driver.quit ();
    }
}
