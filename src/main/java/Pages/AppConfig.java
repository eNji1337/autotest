package Pages;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:./application.properties"})
public interface AppConfig extends Config {

    @Key(value = "webdriver.browser.name")
    String webDriverBrowserName();

    @Key("valid_login")
    String valid_login() ;

    @Key("start.url")
    String startUrl();

    @Key(value = "valid_password")
    String valid_password() ;

    @Key("timeouts.page")
    int pageLoadTimeout();

    @Key("timeouts.element")
    int elementTimeout();
}

