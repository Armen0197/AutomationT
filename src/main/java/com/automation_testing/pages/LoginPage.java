package com.automation_testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement login_id;

    @FindBy(id = "pass")
    private WebElement password_id;

    @FindBy(id = "loginbutton")
    private WebElement login_button;

    public void setLogin(String login) {
        login_id.sendKeys(login);
    }

    public void setPassword(String password) {
        password_id.sendKeys(password);
    }

    public void clickButton() {
        login_button.click();
    }

}
