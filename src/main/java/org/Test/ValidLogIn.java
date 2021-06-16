package org.Test;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidLogIn {

    private LoginPage loginPage;
    private Pages.HomePage HomePage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        HomePage = new HomePage(driver);
    }

    @Test
    public void successfulLoginTest() throws InterruptedException {
        HomePage.open();
        HomePage.signInButton();
        loginPage.enterEmail("autotestingqwerty@gmail.com");
        loginPage.clickNextAfterEmail();
        Thread.sleep(1000);
        loginPage.enterPassword("qwertyauto123");
        loginPage.clickNextAfterPassword();
        loginPage.userEmail();
        loginPage.checkSuccessfulLogin();
    }

    @AfterTest
    public void quit() {
        loginPage.quit();
    }
}

