package org.Test;


import Pages.HomePage;
import Pages.MyAccountPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest {

    final String validLogin = "@Anton41505806";
    final String validPassword = "password12345";

    @Test
    public void test2() {
        new MyAccountPage(driver)
                .profileBtn()
                .profileEditBtn()
                .profileNameInput();
    }
}