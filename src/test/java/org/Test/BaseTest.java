package org.Test;

import Pages.HomePage;
import Pages.PropertyHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    public String validlogin = PropertyHelper.getConf().valid_login();
    public String validpass = PropertyHelper.getConf().valid_password();

    @BeforeMethod
    public void wakeUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        new HomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.get("https://twitter.com/");

    }
    @AfterMethod
    public void quit() {
        driver.quit();

    }
}
