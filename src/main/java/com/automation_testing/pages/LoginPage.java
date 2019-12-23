package com.automation_testing.pages;

import com.automation_testing.helpers.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage <LoginPage> {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement login_id;

    @FindBy(id = "pass")
    private WebElement password_id;

    @FindBy(id = "loginbutton")
    private WebElement login_button;

    public void getLogin(String login) {   //Method name changed
        login_id.sendKeys(login);
    }

    public void getPassword(String password) {    //Method name changed
        password_id.sendKeys(password);
    }

    public void clickButton() {
        login_button.click();
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        WaitHelpers.waitForVisibilityOfElement(this.driver, login_button);
        WaitHelpers.waitForElementToBeClickable(this.driver, login_button);
    }
}
