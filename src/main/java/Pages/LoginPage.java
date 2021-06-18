package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "session[username_or_email]")
    public WebElement inputEmail;

    @FindBy(name = "session[password]")
    public WebElement inputPassword;

    @FindBy(xpath = "//span[text()='Войти']")
    public WebElement loginBtn;


    public  LoginPage enterEmail(String Login){
        inputEmail.sendKeys(Login);
        return this;
    }

    public LoginPage enterPassword(String Password){
        inputPassword.sendKeys(Password);
        return this;
    }

    public LoginPage loginBtnClick(){
        loginBtn.click();
        return this;
    }

}
