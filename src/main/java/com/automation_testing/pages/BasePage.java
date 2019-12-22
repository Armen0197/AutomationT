package com.automation_testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//todo add loadable components for the basePage
public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
