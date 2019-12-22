import com.automation_testing.pages.HomePage;
import com.automation_testing.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestingArea {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        //todo Before class and after class methods should be better to have BaseTest Class and all
        // the tests should be extends from base test
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void facebook_test() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.setLogin("snxchyan2014@mail.ru");  //todo this part should be better to handle get from the property file
        loginPage.setPassword("password"); //todo this part should be better to handle get from the property file
        loginPage.clickButton();

        homePage.clickMessengerButton();
        homePage.clickOnFriendName();
        homePage.clickOnSmile();
        homePage.likeButtonClick();

        //todo need to add checking check testNg assertions types such as Assert.assertEquals(); Assert.assertTrue() etc in ...

    }

    @AfterClass
    //should  be better to move this method into BaseTest
    public void turnDown() {
        driver.quit();
    }
}
