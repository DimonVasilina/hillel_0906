package lesson29;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTestSearchElementByText {

    @BeforeTest
    public void before(){
        open("https://rozetka.com.ua/");
    }

    @Test
    public void test() {
        SelenideElement searchBtn = $(byText("Найти"));
    }
}