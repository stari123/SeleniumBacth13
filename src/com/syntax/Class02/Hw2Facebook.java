package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2Facebook {
    //navigate to fb.com , click on create new account,  fill up all the textboxes
    //click on sign up button, close the pop up, close the browser

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "http://www.fb.com" );

        driver.findElement ( By.linkText ( "Create new account" ) ).click ();
        Thread.sleep ( 2000 );
        driver.findElement ( By.name ( "firstname" ) ).sendKeys ( "Ali" );
        driver.findElement(By.name("lastname")).sendKeys ( "Alican" );
        driver.findElement(By.name ("reg_email__")).sendKeys ( "acan@yahoo.com" );
        driver.findElement ( By.name ( "reg_passwd__" ) ).sendKeys ( "12345678Hello" );

        driver.findElement(By.name("birthday_month")).sendKeys ("March");
        driver.findElement(By.name("birthday_day")).sendKeys ("28");
        driver.findElement(By.name("birthday_year")).sendKeys ("2000");
        driver.findElement(By.name("sex")).sendKeys ("Male");
        driver.findElement(By.name("websubmit")).click ();
       // driver.close();
    }
}
