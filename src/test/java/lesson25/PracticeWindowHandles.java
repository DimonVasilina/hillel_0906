
package lesson25;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class PracticeWindowHandles extends InitialDriver {


    @Test
    public void selectedTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement loginBtn = driver
                .findElement(By.xpath("//button[@class='header__button ng-star-inserted']"));
        loginBtn.click();
        WebElement regBtn = driver
                .findElement(By.xpath("//div[@class='form__row auth-modal__form-bottom']/button[2]"));
        regBtn.click();
        WebElement privatePolicy = driver.findElement(By.xpath("//p[@class='form__caption']/a[1]"));
        privatePolicy.click();

        sleep(5000);

        Set<String> windowHandles = driver.getWindowHandles();

        List<String> handle = new ArrayList<>(windowHandles);
        driver.switchTo().window(handle.get(0));

        sleep(5000);

        driver.switchTo().window(handle.get(1));

        sleep(5000);

    }
}
