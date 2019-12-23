package com.automation_testing.pages;

import com.automation_testing.helpers.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FriendList extends BasePage <FriendList> {  // Added FriendList class

    public FriendList(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href $= \"75/\"]")  // Selector changed
    private WebElement find_friend;

    public void clickOnFriendName() {
        isLoaded();
        find_friend.click();
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        WaitHelpers.waitForElementToBeClickable(this.driver, find_friend);
        WaitHelpers.waitForVisibilityOfElement(this.driver, find_friend);

    }
}
