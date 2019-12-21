import com.automation_testing.pages.HomePage;
import com.automation_testing.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestingArea {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void facebook_test() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.setLogin("snxchyan2014@mail.ru");
        loginPage.setPassword("xdrxalo");
        loginPage.clickButton();

        homePage.clickMessengerButton();
        homePage.clickOnFriendName();
        homePage.clickOnSmile();
        homePage.likeButtonClick();
    }

    @AfterClass
    public void turnDown() {
        driver.quit();
    }


}
