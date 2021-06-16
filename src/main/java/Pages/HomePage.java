package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    // Sign in btn
    public void signInButton() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Войти')]")).click();

    }
    // Mail btn
    public void mailBtn() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Почта']")).click();
    }
    // Gooogle.com URL
    public void open() {
        driver.get("https://www.google.com");
    }

}
