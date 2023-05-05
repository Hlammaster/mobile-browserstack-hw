package tests;

import com.codeborne.selenide.Configuration;
import config.BrowserStackDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeAll
    static void beforeAll(){
        Configuration.browser = BrowserStackDriver.class.getName();
        Configuration.browserSize = null;
    }
    @BeforeEach
    void  addListener(){
        open();
    }

    @AfterEach
    void afterEach(){
        closeWebDriver();
    }
}
