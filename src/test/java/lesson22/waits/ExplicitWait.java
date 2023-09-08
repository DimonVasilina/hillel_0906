package lesson22.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class ExplicitWait {

    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    }

    @Test
    public void testExplicitExample2() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptops = (new WebDriverWait(driver, Duration.ofSeconds(5000))).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-categories__link' and starts-with(text(), 'Ноут')]")));
        laptops.click();
        sleep(5000);
    }

    @Test
    public void testExplicitExample() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptops = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-categories__link' and starts-with(text(), 'Ноут')]")));
        laptops.click();
        sleep(5000);
    }
}
