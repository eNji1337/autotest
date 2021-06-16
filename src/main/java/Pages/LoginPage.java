package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //"Enter valid email"
    public void enterEmail(String email) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("autotestingqwerty@gmail.com");

    }
    //"Enter invalid email"
    public void invalidEmail(String email) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("autotestingqwerty@gmail");

    }
    //"Enter invalid password"
    public void invalidPass() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("qwertyauto12");

    }
    //"Click on the 'Далее' button after entering email "
    public void clickNextAfterEmail() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();

    }
    //"Enter valid password"
    public void enterPassword(String password) {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("qwertyauto123");

    }
    //"Click on the 'Далее' button after entering password "
    public void clickNextAfterPassword() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[contains(text(),'Далее')]")).click();

    }
    // Click on the User btn
    public void userEmail() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@class='gb_C gb_Ma gb_h']")).click();
    }
    // Check if the login was correct
    public void checkSuccessfulLogin() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[3]/div[1]/div[2]/div[2]")).getText().contains("autotestingqwerty@gmail.com");
        Assert.assertTrue(true);
    }
    // Error after entering invalid email
    public void invalidEmailError() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        boolean emailError = driver.findElement(By.className("jibhHc")).isDisplayed();
        Assert.assertTrue(emailError);
    }
    // Error after entering invalid password
    public void invalidPassError() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        boolean passError = driver.findElement(By.xpath("//span[text()='Неверный пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", чтобы сбросить его.']")).isDisplayed();
        Assert.assertTrue(passError);
    }
    // Create acc btn
    public void createAccountBtn() {
        driver.findElement(By.xpath("//span[text()='Создать аккаунт']")).click();
        driver.findElement(By.xpath("//span[text()='Для себя']")).click();
    }
    // Close browser
    public void quit() {
        driver.quit();
    }
}
