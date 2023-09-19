package lesson28;

import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class FirrstSelenideTest {

//    @BeforeTest
//    public void setupDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
    @BeforeTest
    public void before() {
        open("https://www.google.com.ua/");
    }
//
//    @Test
//    public void testOnChrome() throws InterruptedException {
//
//        driver.get("https://www.google.com.ua/");
//        WebElement inputSearch = driver.findElement(By.name("q"));
//        WebElement searchBtn = driver.findElement(By.name("btnK"));
//
//        inputSearch.sendKeys("Hillel");
//        searchBtn.click();
//        sleep(10000);
//    }

    @Test
    public void selenideTest() throws InterruptedException {
        $(By.name("q")).setValue("Hillel").pressEnter();
        sleep(2000);
    }
//
//    @AfterTest
//    public void close() {
//        driver.close();
//    }}

    @Test
    public void selenideSecondTest(){
        $(By.xpath("(//input[@name='btnK'])[2]"))
                .shouldHave(Condition.value("Пошук "), Duration.ofSeconds(5000))
                .shouldHave(Condition.exactValue("Пошук Google"))
                 .shouldBe(Condition.visible)
                .click();
    }
}
