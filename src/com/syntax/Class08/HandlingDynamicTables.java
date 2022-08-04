package com.syntax.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicTables {

        //this example is done in class09 date, july 25.

    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); // getting webelement in return
        username.sendKeys("Tester"); // performing action on the specific element
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        //identfy table and save rows in List
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr"));
        // last time we use iterator and advance loop.
        // this time we will use regular for loop just to learn to manipulate with different loops.
        for(int i = 1; i < rows.size(); i++) {
            String rowText = rows.get(i).getText();     //when using regular loop we get each element by index, hence get(i).
                                                        //for advanced for loop we dont have get(i). i work differently.
            System.out.println(rowText);
            //if(rowText.contains("Bob Feather")) {    //if you  want to click only on Bob Feather
            if(rowText.contains("FamilyAlbum")) {      //if you want to mark 3 checkbook, use common terms, like Family Album
                                                        //if you dont have common term then use if condition
                List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr/td[1]"));
                checkboxes.get(i - 1).click();
            }
        }
                    // it is marking only 2 check box for FamilyAlbum?ask

    }           //this may be a real tie scenario
}