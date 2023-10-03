package lesson29;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideMethods {

    @Test
    public void test() {
        SelenideElement someElement = $("");
        String returnedText = someElement.text(); // will return text from element
        String returnedAttribute = someElement.attr("color"); // will return value of attribute color
        String returnedCssValue = someElement.getCssValue("background-color"); // will return value of css background-color
    }
}