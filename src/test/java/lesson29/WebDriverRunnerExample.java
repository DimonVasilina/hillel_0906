package lesson29;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.*;

public class WebDriverRunnerExample {

    @Test
    public void testWithWebDriverRunner(){
        WebDriver driver = getWebDriver();

        String currentUrl = url();
        System.out.println(currentUrl);

        String currentPageSource = source();
        System.out.println(currentPageSource);

    }

}