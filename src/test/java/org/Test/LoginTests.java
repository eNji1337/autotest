package org.Test;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
/*    final String VALID_LOGIN = "@Anton41505806";
    final String VALID_PASSWORD = "password12345";*/

    @Test
    public void test1() {
        new HomePage(driver)
                .goToLoginPage()
                .enterEmail(validlogin)
                .enterPassword(validpass)
                .loginBtn()
                .checkCorrectLogin();
    }
}
