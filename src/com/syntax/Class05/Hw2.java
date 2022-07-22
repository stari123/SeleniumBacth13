package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw2 {
    /* HW2
     Go to ebay.com
     get all the categories and print them in the console
     select Computers/Tables & Networking
     click on search
     verify the header*/
    public static String url = "https://www.ebay.com ";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( url );
        Thread.sleep ( 2000 );

        WebElement categoriesDD = driver.findElement ( By.cssSelector ( "select.gh-sb" ) );
        Select s1 = new Select ( categoriesDD );

        List<WebElement> options = s1.getOptions ();
        for (WebElement option : options) {
            String optionText = option.getText ();
            System.out.println ( optionText );
        }
        s1.selectByValue ( "58058" );

        WebElement search = driver.findElement ( By.id ( "gh-btn" ) );
        search.click ();

        /*String title = driver.getTitle ();
        String expectedTitle = "Computers, Tablets & Network Hardware";
        if (title.equals ( expectedTitle )) {
            System.out.println ( "Title is Correct" );
        } else {
            System.out.println ( "Title is not correct" );
        }*/

        WebElement header = driver.findElement ( By.xpath ( "//span[@class='b-pageheader__text']" ) );
        String headerText = header.getText ();
        if (header.isDisplayed () && headerText.equals ( "Computers, Tablets & Network Hardware" )) ;
        System.out.println ( "Header displayed and verified" );
    }
}