package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class gmailPage {
    WebDriver driver;
    public Faker faker;


    public gmailPage(WebDriver driver, Faker faker) {
        this.driver = driver;
        this.faker = faker;
    }

    public void sendEmailBtn() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='Написать']")).click();
    }

    public void enterEmailToSend() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String email = faker.internet().emailAddress();
        driver.findElement(By.name("to")).sendKeys(email);
    }

    void newMessageWindow() {
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath("//*[text()='Новое сообщение']"));
        //wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//*[text()='Новое сообщение']")));
    }

    public void enterTextForEmail() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String randomText = faker.buffy().quotes();
        driver.findElement(By.id(":bh")).sendKeys(randomText, Keys.CONTROL, Keys.ENTER);

    }

    public void confimMessageAboutSendMail() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.className("bAq")).isDisplayed();
        Assert.assertTrue(true);
    }
}

