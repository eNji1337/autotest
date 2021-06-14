package org.Test;

import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvalidEmail {

    private WebDriver driver;
    private LoginPage loginPage;
    private Pages.HomePage HomePage;


    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        HomePage = new HomePage(driver);
    }

    @Test
    public void invalidEmail() {
        HomePage.open();
        HomePage.signInButton();
        loginPage.invalidEmail("autotestingqwerty@gmail");
        loginPage.clickNextAfterEmail();
        loginPage.invalidEmailError();
    }
    @AfterTest
    public void quit() {
        loginPage.quit();
    }
}
