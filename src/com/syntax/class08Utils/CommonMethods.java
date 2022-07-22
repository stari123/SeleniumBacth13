package com.syntax.class08Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
    /*HW2:  (from class08)  sol from abdul(Seatle)
    create a package and name it as utils
    create a class and name as CommonMethods
    create functions (methods) to open and quit the browsers
    open method has to accept a url as a parameter*/

    WebDriver driver = new ChromeDriver ();
    public void closeBrowser(){
        driver.quit();
    }
    public void openBrowser(String url){
        driver.get(url);
    }
}
