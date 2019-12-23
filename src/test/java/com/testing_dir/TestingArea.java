package com.testing_dir;

import com.automation_testing.pages.ChatWith_A_Friend;
import com.automation_testing.pages.FriendList;
import com.automation_testing.pages.HomePage;
import com.automation_testing.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingArea extends BaseTests {

    @Test
    public void facebook_test() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        FriendList friendList = new FriendList(driver);
        ChatWith_A_Friend chatWith_a_friend = new ChatWith_A_Friend(driver);

        loginPage.getLogin("snxchyan2014@mail.ru");
        loginPage.getPassword("*******");
        loginPage.clickButton();

        homePage.clickMessengerButton();

        friendList.clickOnFriendName();

        chatWith_a_friend.clickOnSmile();
        chatWith_a_friend.likeButtonClick();

        // Check added
        Assert.assertEquals(driver.getTitle(), "Facebook");
    }
}
