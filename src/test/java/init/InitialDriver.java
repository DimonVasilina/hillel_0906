package init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class InitialDriver {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
