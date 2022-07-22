package com.syntax.Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    //compare title with the expected title. for expected title check the web site.

    public static void main(String[] args) {

        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "http://www.fb.com" );
        driver.manage ().window ().maximize ();
        String title = driver.getTitle ();
        String expectedTitle = "Facebook - log in or sign up";
        if (title.equals ( expectedTitle )) {
            System.out.println ( "Title is correct" );
        } else {
            System.out.println ( "Title is Not correct" );
        }
        driver.quit ();
    }
}
