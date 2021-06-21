package org.Test;

import Pages.MyAccountPage;
import org.testng.annotations.Test;

public class SendTweetTest extends BaseTest {

    @Test
    public void test2() {
        new MyAccountPage(driver)
            .sendTweetBtn()
            .tweetMsgInput();
    }
}