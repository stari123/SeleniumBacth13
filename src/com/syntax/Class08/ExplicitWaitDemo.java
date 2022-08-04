package com.syntax.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

    public static String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement getNewUserButton = driver.findElement(By.id("save"));
        getNewUserButton.click();

        //create object of Webdriver wait
        WebDriverWait wait = new WebDriverWait(driver, 20);

        //set condition to wait, expected condition is class
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'First Name :')]")));

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name :')]"));
        System.out.println(firstName.getText());

    }
}