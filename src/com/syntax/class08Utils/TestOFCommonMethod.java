package com.syntax.class08Utils;

public class TestOFCommonMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        CommonMethods commonMethods = new CommonMethods();
        commonMethods.openBrowser("https://www.google.com");
        commonMethods.closeBrowser();

    }
}
