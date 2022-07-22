package com.syntax.Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
   /* Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    verify the header text Sorry, We Couldn't Find Anything For “Asksn” is displayed
    verify enroll today button is enabled*/

    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( url );
        driver.manage ().window ().maximize ();

        driver.switchTo ().frame ( 0 );
        WebElement header = driver.findElement ( By.xpath ( "//h1[@class='heading-13']" ) );
        String headerText = header.getText ();
        if (header.isDisplayed ()) {
            System.out.println ( "Header is displayed" );
        } else {
            System.out.println ( "not displayed" );
        }

        driver.switchTo().defaultContent();

        driver.switchTo ().frame ( 1 );

        WebElement  enrollButton= driver.findElement ( By.xpath ( "//a[text()='Enroll']" ) );
        boolean b= enrollButton.isEnabled ();
        System.out.println (b);
    // OR use if
        /*if (enrollButton.isEnabled()) {
            System.out.println("Enroll button is enabled");
        } else {
            System.out.println("Enroll button is not enabled");*/
        driver.switchTo().defaultContent();

        driver.close();
    }

}