package com.tariSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDanVideo {

    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver", "Drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "https://www.google.com/" );
        driver.navigate ().to ( "https:www.facebook.com" );
        driver.navigate ().back ();
        driver.navigate ().forward ();
        driver.navigate ().refresh ();
    }
}