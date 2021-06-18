package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Profile']")
    WebElement profilebtn;

    @FindBy(xpath = "//span[text()='Edit profile']")
    WebElement editProfileBtn;


    public MyAccountPage profileBtn(){
        profilebtn.click();
        return this;
    }
    public MyAccountPage profileEditBtn(){
        editProfileBtn.click();
        return this;
    }

    }
