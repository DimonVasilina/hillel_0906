package lesson25;

import init.InitialDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PracticeJsExecutor3 extends InitialDriver {

    @Test
    public void jsExecutorAlertTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("alert('Are you sure?');");
        sleep(5000);

        driver.switchTo().alert().accept();

        sleep(5000);

    }
}
