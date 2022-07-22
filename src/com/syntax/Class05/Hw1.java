package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw1 {
    /*HW1: Go to facebook sign up page
    Fill out the whole form, Click signup */

    public static String url = "https://www.facebook.com ";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( url );
        Thread.sleep ( 2000 );

        WebElement CreateANewAccount = driver.findElement ( By.linkText ( "Create new account" ) );
        CreateANewAccount.click ();
        Thread.sleep ( 2000 );

        WebElement firstName=driver.findElement ( By.xpath ( "//input[@name='firstname']" ) );
        firstName.sendKeys ( "Ali" );
        WebElement lastName=driver.findElement ( By.xpath ( "//input[@name='lastname']" ) );
        lastName.sendKeys ( "Alican" );
        WebElement email=driver.findElement ( By.xpath ( "//input[@name='reg_email__']" ) );
        email.sendKeys ( "alican123@yahoo.com" );
        WebElement pass=driver.findElement ( By.cssSelector ( "input#password_step_input" ) );
        pass.sendKeys ( "hello123" );
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.id ("month"));
        Select s1 = new Select(month);
        s1.selectByVisibleText ( "Mar" );
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.id ("day"));
        Select s2 = new Select(day);
        s2.selectByValue ("21");
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.id ("year"));
        Select s3 = new Select(year);
        s3.selectByValue ( "2001" );
        Thread.sleep(2000);

        WebElement sex = driver.findElement(By.xpath ("//input[@value='2']"));
        sex.click ();

        //WebElement login = driver.findElement(By.xpath ("//button[@name='websubmit']"));
        //login.click ();
    }
}
