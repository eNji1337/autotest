package Work2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class App {
    @Test
    public static void main(String[] args) throws Exception {
        WebDriver driver = null;
        Tests test1 = new Tests(driver, "autotestingqwerty@gmail.com", "qwertyauto123");

        test1.logIneJSExecutor();
        test1.openNewTabAndLogin();
    }
}
