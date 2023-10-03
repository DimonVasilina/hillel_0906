package lesson30.log4j.ashot;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class VisualRegressionTestComparing {

    @Test
    public void screenShot() throws IOException {
        open("https://www.google.com/");
        Screenshot screenshot = new AShot().takeScreenshot(getWebDriver());


        BufferedImage expectegImage = ImageIO.read(new File("screen/screen.png"));
        BufferedImage actual = screenshot.getImage();

        ImageDiffer imageDiffer = new ImageDiffer();
        ImageDiff imageDiff = imageDiffer.makeDiff(expectegImage, actual);

        if (imageDiff.hasDiff()){
            Assert.fail("Image are not");
        } else {
            System.out.println("Image are same");
            }
        }

}
