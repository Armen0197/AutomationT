package com.automation_testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class BasePage <T extends LoadableComponent<T>> extends LoadableComponent<T> { // Added Loadable components

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    protected void load() {

    }

    protected void isLoaded() throws Error {

    }
}
