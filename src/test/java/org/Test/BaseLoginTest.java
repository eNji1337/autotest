package org.Test;

import Pages.BasePage;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeTest;

public class BaseLoginTest  extends BaseTest{
    private String validLogin = "@Anton41505806";
    private String validPassword = "password12345";


    @BeforeTest
    public void login() {
        new HomePage(driver)
                .goToLoginPage()
                .enterEmail(validLogin)
                .enterPassword(validPassword)
                .loginBtn();
    }
}
