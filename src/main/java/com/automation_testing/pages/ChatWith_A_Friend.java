package com.automation_testing.pages;

import com.automation_testing.helpers.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatWith_A_Friend extends BasePage <ChatWith_A_Friend> {  // Added ChatWith_A_Friend class

    public ChatWith_A_Friend(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div[data-testid *= \"emoji\"]")  // Selector changed
    private WebElement smile_button;

    @FindBy(css = "div[data-testid $= \"_hotlike_button\"]")  // Selector changed
    private WebElement like_button;

    public void clickOnSmile() {
        isLoaded();
        smile_button.click();
    }

    public void likeButtonClick() {
        isLoaded();
        like_button.click();
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        WaitHelpers.waitForElementToBeClickable(this.driver, like_button);
        WaitHelpers.waitForVisibilityOfElement(this.driver, smile_button);
    }
}
