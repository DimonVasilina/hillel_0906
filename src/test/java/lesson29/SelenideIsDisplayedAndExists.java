package lesson29;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideIsDisplayedAndExists {

    @Test
    public void test() {
        SelenideElement someElement = $("");
        someElement.isDisplayed();// true if DOM and Page visible
        someElement.exists();// true if only DOM visible
    }
}