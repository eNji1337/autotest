package org.Test;


import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest {

    public String validLogin = "@Anton41505806";
    public String validPassword = "password12345";

    @BeforeMethod
    public void login() {
        new HomePage(driver)
                .goToLoginPage();
        new LoginPage(driver)
                .enterEmail(validLogin)
                .enterPassword(validPassword)
                .loginBtnClick();
    }
    @Test
    public void test1() {
        new MyAccountPage(driver)
                .profileBtn()
                .profileEditBtn();
    }

}