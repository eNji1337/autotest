package org.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.registrationPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreatingNewAcc {

    private WebDriver driver;
    private LoginPage loginPage;
    private Pages.registrationPage registrationPage;
    private HomePage homePage;
    Faker faker = new Faker();

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        registrationPage = new registrationPage(driver, faker);
        homePage = new HomePage(driver);
    }

    @Test
    public void Registation() throws InterruptedException {
        homePage.open();
        homePage.signInButton();
        loginPage.createAccountBtn();
        registrationPage.enterName();
        registrationPage.enterSurname();
        registrationPage.enterUserName();
        registrationPage.enterPassword();
        registrationPage.confirmPassword();
        registrationPage.nextBtn();
    }

    @AfterTest
    public void quit() {
        loginPage.quit();
    }
}
