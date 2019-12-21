package com.automation_testing.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WaitHelpers {

    public static final int TIMEOUT = 10;

    public static void waitForElementToBeClickable(WebDriver driver, WebElement element) {
        try{
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(elementToBeClickable(element));
       } catch (WebDriverException e) {
            System.out.println("Element is not clickable");
            e.printStackTrace();
        }
    }

    // Not used
    public static void waitForVisibilityOfElement(WebDriver driver, WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            wait.until(visibilityOf(element));
        } catch (WebDriverException e) {
            System.out.println("Element is not visible");
            e.printStackTrace();
        }
    }

}
