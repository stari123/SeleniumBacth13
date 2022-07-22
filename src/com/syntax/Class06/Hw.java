package com.syntax.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
    /* Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    click on each button and handle the alert accordingly  */

    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( url );
        driver.manage ().window ().maximize ();

        WebElement clickMe1= driver.findElement ( By.xpath ( "//button[@class='btn btn-default']" ));
        clickMe1.click ();
        Thread.sleep ( 2000 );
        Alert alert1=driver.switchTo ().alert ();
        alert1.accept ();

        WebElement clickMe2= driver.findElement (By.xpath ( "//button[@onclick='myConfirmFunction()']" ));
        clickMe2.click ();
        Thread.sleep ( 2000 );
        Alert confirm=driver.switchTo ().alert ();
        Thread.sleep ( 2000 );
        confirm.dismiss ();

        WebElement clickMe3= driver.findElement (By.xpath ( "//button[@onclick='myPromptFunction()']" ));
        clickMe3.click ();
        Thread.sleep ( 2000 );
        Alert prompt=driver.switchTo ().alert ();
        Thread.sleep ( 2000 );
        prompt.sendKeys ( "hello" );
        prompt.accept ();

    }
}