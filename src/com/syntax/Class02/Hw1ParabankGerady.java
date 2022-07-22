package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1ParabankGerady {
    public static void main(String[] args) {

        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();

        driver.manage ().window ().maximize ();
        driver.get ( "https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22" );
        driver.findElement ( By.id ( "customer.firstName" ) ).sendKeys ( "Ali" );
        driver.findElement ( By.name ( "customer.lastName" ) ).sendKeys ( "Alican" );
        driver.findElement ( By.id ( "customer.address.street" ) ).sendKeys ( "101 frozenlake Street" );
        driver.findElement ( By.name ( "customer.address.city" ) ).sendKeys ( "Richmond" );
        driver.findElement ( By.id ( "customer.address.state" ) ).sendKeys ( "Chicago" );
        driver.findElement ( By.name ( "customer.address.zipCode" ) ).sendKeys ( "IL 60598" );
        driver.findElement ( By.id ( "customer.phoneNumber" ) ).sendKeys ( "123-456-7896" );
        driver.findElement ( (By.name ( "customer.ssn" )) ).sendKeys ( "234-88-5456" );
        driver.findElement ( By.id ( "customer.username" ) ).sendKeys ( "AliALican" );
        driver.findElement ( By.name ( "customer.password" ) ).sendKeys ( "12345678ALi" );
        driver.findElement ( By.id ( "repeatedPassword" ) ).sendKeys ( "12345678Ali" );
        driver.findElement ( By.cssSelector ( "input[value=Register]" ) ).click ();
        driver.quit ();

    }
}
