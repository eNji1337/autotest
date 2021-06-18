package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Войти']")
    public WebElement logInButton;

    public void goToLoginPage() {
        logInButton.click();
    }


}
