package tests.local;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;


public class LocalTests extends TestBase {
    @Test
    void successfulSearchTest() {
            $$(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(CollectionCondition.texts("The Free Encyclopedia …in over 300 languages"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/imageViewCentered")).shouldBe(Condition.visible);
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(Condition.text("Reading lists with sync"));
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/acceptButton")).shouldHave(Condition.enabled).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/main_toolbar_wordmark")).shouldHave(Condition.enabled);
    }
}
