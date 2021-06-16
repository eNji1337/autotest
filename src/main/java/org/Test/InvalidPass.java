package org.Test;

import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvalidPass {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void invalidEmail() throws InterruptedException {
        homePage.open();
        homePage.signInButton();
        loginPage.enterEmail("autotestingqwerty@gmail.com");
        loginPage.clickNextAfterEmail();
        Thread.sleep(1000);
        loginPage.invalidPass();
        loginPage.clickNextAfterPassword();
        Thread.sleep(2000);
        loginPage.invalidPassError();
    }
    @AfterTest
    public void quit() {
        loginPage.quit();
    }
}
