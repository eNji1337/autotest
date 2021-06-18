package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Войти']")
    public WebElement logInButton;

    public LoginPage goToLoginPage() {
        logInButton.click();
        return new LoginPage(driver);
    }
}
