package Work2;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tests {
    WebDriver driver;
    String Password;
    String Login;
    WebDriverWait wait = new WebDriverWait(driver,30);
    public Tests(WebDriver driver, String login, String password) {
        this.driver = driver;
        Password = password;
        Login = login;
    }

    public void logIneJSExecutor() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://google.com/");

        WebElement loginbtn = driver.findElement(By.xpath("//a[contains(text(),'Войти')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginbtn);

        WebElement emailField = driver.findElement(By.xpath("//input[@id='identifierId']"));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("password"))));
        WebElement passwordField = driver.findElement(By.name("password"));

        JavascriptExecutor login =  driver;
        login.executeScript("arguments[0].value = 'autotestingqwerty@gmail.com'",loginbtn);

        JavascriptExecutor enterPass = driver;
        login.executeScript("arguments[0].value = 'qwertyauto123'",passwordField);

        WebElement buttonLogg = driver.findElement(By.id("login_button"));
        JavascriptExecutor clickToLogButton = driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", buttonLogg);

        driver.quit();
    }

    public void openNewTabAndLogin(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        String link = "window.open('https://google.com/','_blank');";

        JavascriptExecutor openNewSameTab = driver;
        openNewSameTab.executeScript(link);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        String secondTab = windows.get(1);
        driver.switchTo().window(secondTab);

        WebElement buttonLog = driver.findElement(By.xpath("//a[contains(text(),'Войти')]"));
        buttonLog.click();

        WebElement emailField = driver.findElement(By.xpath("//input[@id='identifierId']"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement buttonLogg = driver.findElement(By.xpath("//*[contains(text(),'Далее')]"));

        new Actions(driver)
                .sendKeys(emailField,Login )
                .sendKeys(passwordField, Password)
                .click(buttonLogg)
                .build()
                .perform();
        driver.quit();
    }
}