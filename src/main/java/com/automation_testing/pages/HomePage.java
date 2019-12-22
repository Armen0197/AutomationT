package com.automation_testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation_testing.helpers.WaitHelpers;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
//todo copy css selectors is not the best solution check how to handle css selectors
    @FindBy(css = "div.l9j0dhe7[aria-label=\"Messenger\"]")
    private WebElement messenger_button;

    @FindBy(css = "div[class=\"rq0escxv j83agx80 cbu4d94t k4urcfbm\"]")
    private WebElement open_messenger;  // Not used

    @FindBy(css = "a[href=\"/messages/t/user:100004068216875/\"]")
    private WebElement find_friend;

    @FindBy(css = "div[class=\"buofh1pr ni8dbmo4 stjgntxs j83agx80 bp9cbjyn\"]")
    private WebElement chat_opened;     // Not used

    @FindBy(css = "div[aria-label=\"Выберите смайлик\"]")
    private WebElement smile_button;

    @FindBy(css = "div._3vgi[style=\"min-height: 1800px;\"]")
    private WebElement smiles_opened;   // Not used

    @FindBy(css = "svg[class=\"sqpo3gyd\"]")
    private WebElement like_button;

    public void clickMessengerButton() {
        // todo you can import this class into object and call it by className
        WaitHelpers.waitForElementToBeClickable(this.driver, messenger_button);
        messenger_button.click();
    }

    public void clickOnFriendName() {
        WaitHelpers.waitForElementToBeClickable(this.driver, find_friend);
        find_friend.click();
    }

    public void clickOnSmile() {
        WaitHelpers.waitForElementToBeClickable(this.driver, smile_button);
       smile_button.click();
    }

    public void likeButtonClick() {
        WaitHelpers.waitForElementToBeClickable(this.driver, like_button);
        like_button.click();
    }
}

