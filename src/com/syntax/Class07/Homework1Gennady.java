package com.syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Homework1Gennady {
    /*HW 1
    Go to https://demoqa.com/browser-windows
    click on New Tab and print the text from new tab in the console
    click on New Window and print the text from new window in the console
    click on New Window Message and print the text from new window in the console
    Verify (compare) the titles for each page
    Print out the title of the all pages  */

    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver ();
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainHandle = driver.getWindowHandle();
        //System.out.println ( "mainHandle = " + mainHandle );


       //print newtab text and SET string
        WebElement newTabButton=driver.findElement ( By.id ("tabButton") );
        newTabButton.click ();

        Set<String>  allWindowHandles=driver.getWindowHandles ();
        Iterator<String> iterator = allWindowHandles.iterator();
        iterator.next();
        String newTabHandle = iterator.next();
        String textNewTab = driver.switchTo().window(newTabHandle).findElement(By.id("sampleHeading")).getText();
        System.out.println ( textNewTab );
        driver.close();

        //print newWindow Text
        driver.switchTo ().window ( mainHandle );
        Thread.sleep(2000);
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();
        allWindowHandles = driver.getWindowHandles();
        iterator=allWindowHandles.iterator();
        iterator.next();
        String newWindowHandle=iterator.next();
        String textNewWindow = driver.switchTo().window(newWindowHandle).findElement(By.id("sampleHeading")).getText();
        System.out.println(textNewWindow);
        driver.close();

        //print window hadle
        driver.switchTo().window(mainHandle);
        Thread.sleep(2000);
        WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
        newWindowMessage.click();
        allWindowHandles = driver.getWindowHandles();
        iterator=allWindowHandles.iterator();
        iterator.next();
        String newWindowMessageHandle=iterator.next();
        //System.out.println ( "newWindowMessageHandle = " + newWindowMessageHandle );
        driver.close();

        //print newWindowMessage text
        driver.switchTo().window(newWindowMessageHandle);
        // below code is working only in FireFox
        String textNewWindowMessage= driver.findElement(By.xpath("/html/body")).getText();
        System.out.println(textNewWindowMessage);
        driver.close();

        //Verify (compare) the titles for each page,  not done
        // Print out the title of the all pages,  not done




    }


}
