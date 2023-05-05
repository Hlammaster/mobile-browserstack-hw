import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class BrowserStackTests extends TestBase {
    @Test
    void searchTest() throws MalformedURLException, InterruptedException {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                .shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
