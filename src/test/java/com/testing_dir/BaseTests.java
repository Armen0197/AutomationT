package com.testing_dir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTests {   // Added BaseTests class

    public static WebDriver driver;
    public static final String TESTING_URL = "https://www.facebook.com/";

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();  // Added WebDriverManager
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(TESTING_URL);
    }

    @AfterMethod
    public static void closeDriver() {
        driver.close();
    }

    @AfterClass
    public static void turnDown() {
        driver.quit();
    }
}
