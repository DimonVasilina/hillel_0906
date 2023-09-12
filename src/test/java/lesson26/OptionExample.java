package lesson26;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class OptionExample extends InitialDriver {

    @Test
    public void optionExampleTest() throws InterruptedException {
        Select dropDown = new Select(driver.findElement(By.id("dropdown")));
        dropDown.selectByValue("1");
        sleep(5000);
        dropDown.selectByIndex(2);
        sleep(5000);
    }
}
