package com.tariSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemoAselVideo {
    public static void main(String[] args) {
    //1. set a system property
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    //2 create an object of webdriver type
        WebDriver driver=new ChromeDriver ();
    //3. Navigater to Syntax application
        driver.get("https://syntaxtechs.com");

    }
}
