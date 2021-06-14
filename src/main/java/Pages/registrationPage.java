package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class registrationPage {
    WebDriver driver;
    private Faker faker;

    public registrationPage(WebDriver driver, Faker faker) {
        this.driver = driver;
        this.faker = faker;
    }

    public void enterName() {
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        String name = faker.name().firstName();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(name);
    }

    public void enterSurname() {
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        String surname = faker.name().lastName();
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(surname);
    }

    public void enterUserName() {
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        String username = faker.name().username();
        long numbers = faker.number().randomNumber();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username + numbers);
    }

    public void enterPassword() {
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.findElement(By.name("Passwd")).sendKeys("Password123qwerty");
    }

    public void confirmPassword() {
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Password123qwerty");
    }

    public void nextBtn() {
        driver.findElement(By.xpath("//span[text()='Далее']")).click();
    }
}

