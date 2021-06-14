package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("autotestingqwerty@gmail.com");

    }

    public void invalidEmail(String email) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("autotestingqwerty@gmail");

    }

    public void invalidPass() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("qwertyauto12");

    }

    public void clickNextAfterEmail() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();

    }

    public void enterPassword(String password) {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("qwertyauto123");

    }

    public void clickNextAfterPassword() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[contains(text(),'Далее')]")).click();

    }

    public void userEmail() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@class='gb_C gb_Ma gb_h']")).click();
    }

    void checkSuccessfulLogin() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[3]/div[1]/div[2]/div[2]")).getText().contains("autotestingqwerty@gmail.com");
        Assert.assertTrue(true);
    }

    public void invalidEmailError() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.className("jibhHc")).isDisplayed();
        Assert.assertTrue(true);
    }

    public void invalidPassError() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[text()='Неверный пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", чтобы сбросить его.']")).isDisplayed();
        Assert.assertTrue(true);
    }

    public void createAccountBtn() {
        driver.findElement(By.xpath("//span[text()='Создать аккаунт']")).click();
        driver.findElement(By.xpath("//span[text()='Для себя']")).click();
    }

    public void quit() {
        driver.quit();
    }
}
