package lesson30.log4j.ashot;

import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class VisualRegressionTest {
    @Test
    public void screenShot() throws IOException {
        open("https://www.google.com/");
        Screenshot screenshot = new AShot().takeScreenshot(getWebDriver());
        ImageIO.write(screenshot.getImage(), "PNG", new File("screen/screen.png"));
    }
}
