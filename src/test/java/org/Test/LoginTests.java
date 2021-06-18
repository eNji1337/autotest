package org.Test;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    public String validLogin = "@Anton41505806";
    public String validPassword = "password12345";

    // это для начала, дальше запушу больше

    @Test
    public void test1() {
         new HomePage(driver)
                .goToLoginPage();
         new LoginPage(driver)
                 .enterEmail(validLogin)
                 .enterPassword(validPassword)
                 .loginBtnClick();
    }
}
