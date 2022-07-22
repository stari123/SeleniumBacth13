package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2FacebookGerady {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        //driver1.manage().window().maximize();
        driver.get ( "https://www.fb.com/" );

        //driver1.manage().window().maximize();
        driver.findElement ( By.cssSelector ( "a[data-testid=open-registration-form-button]" ) ).click ();
             Thread.sleep ( 2000 );
        driver.findElement ( By.name ( "firstname" ) ).sendKeys ( "Teresa" );
        driver.findElement ( By.name ( "lastname" ) ).sendKeys ( "Swims" );
        driver.findElement ( By.name ( "reg_email__" ) ).sendKeys ( "805-585-7896" );
        driver.findElement ( By.name ( "reg_passwd__" ) ).sendKeys ( "12345678Name" );
        driver.findElement ( By.name ( "birthday_month" ) ).sendKeys ( "Sep" );
        driver.findElement ( By.name ( "birthday_day" ) ).sendKeys ( "1" );
        driver.findElement ( By.name ( "birthday_year" ) ).sendKeys ( "1951" );
        driver.findElement ( By.cssSelector ( "input._8esa[value='1']" ) ).click ();
             Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "//button[text()='Sign Up']" ) ).click ();
             Thread.sleep ( 2000 );
        driver.findElement ( By.cssSelector ( "img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']" ) ).click ();
             Thread.sleep ( 2000 );
        //driver.quit ();


    }
}
