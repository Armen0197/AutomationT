package com.automation_testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation_testing.helpers.WaitHelpers;


public class HomePage extends BasePage <HomePage> {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div[data-testid ^= \"MWI\"]") // Selector changed
    private WebElement messenger_button;

    public void clickMessengerButton() {
        isLoaded();
        messenger_button.click();
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        WaitHelpers.waitForElementToBeClickable(this.driver, messenger_button);
        WaitHelpers.waitForVisibilityOfElement(this.driver, messenger_button);
    }
}

