package com.syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    /*HRMS Application Negative Login:
    Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username, Leave password field empty, Click on login button.
    Verify error message with text “Password cannot be empty” is displayed.  */

    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login" );

        WebElement userName = driver.findElement ( By.cssSelector ( "input#txtUsername" ) );
        userName.sendKeys ( "Admin" );
        WebElement password = driver.findElement ( By.cssSelector ( "input#txtPassword" ) );
        password.sendKeys ( "" );
        WebElement buttonLogin = driver.findElement ( By.cssSelector ( "input.button" ) );
        buttonLogin.click ();
        WebElement messageWithText = driver.findElement ( By.cssSelector ( "span#spanMessage" ) );
        boolean displayed = messageWithText.isDisplayed ();
        if (displayed) {
            System.out.println ( "Password cannot be empty is displayed" );
        } else {
            System.out.println ( "not dislayed" );
        }
    }
}