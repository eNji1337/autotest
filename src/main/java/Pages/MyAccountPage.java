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

    @FindBy(name = "displayName")
    WebElement profileNameInput;

    @FindBy(xpath = "//span[text()='Tweet']")
    WebElement sendTweetBtn;

    @FindBy(className = "DraftEditor-editorContainer")
    WebElement tweetMsgInput;

    public MyAccountPage tweetMsgInput() {
        tweetMsgInput.sendKeys("some tweets");
        return this;
    }


    public MyAccountPage sendTweetBtn() {
        sendTweetBtn.click();
        return this;
    }

    public MyAccountPage profileNameInput() {
        profileNameInput.sendKeys("someKeys");
        return this;
    }

    public MyAccountPage profileBtn() {
        profilebtn.click();
        return this;
    }

    public MyAccountPage profileEditBtn() {
        editProfileBtn.click();
        return this;
    }

}
