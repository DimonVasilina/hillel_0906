package lesson26;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class Hw26 extends InitialDriver {

    @Test
    public void checkCountShareItems() throws InterruptedException {
    driver.get("https://rozetka.com.ua/ua/");
        WebElement shareContainer = driver
                .findElement(By
                .xpath("//h2[contains (text(),'Акційні пропозиції')]//ancestor::rz-goods-section"));
        List<WebElement> shareCard = shareContainer.findElements(By.tagName("li"));
        Assert.assertEquals(shareCard.size(), 6 ,"Акційні пропозиції doesn`t have 6 items");
        WebElement priceFirstShareItem =  shareCard.get(0)
                .findElement(By.xpath("//div[contains(@class, 'tile__price tile')]"));
        String countPriceMainPage = priceFirstShareItem.getText();
        shareCard.get(0).click();
        System.out.println(countPriceMainPage);
        WebElement priceProductCard = driver
                .findElement(By.xpath("//p[@class='product-price__big product-price__big-color-red']"));
        String countPriceProductCard = priceProductCard.getText();
        System.out.println(countPriceProductCard);
        Assert.assertEquals(countPriceProductCard, countPriceMainPage, "Price doesn`t equal");
        driver.navigate().back();
        Assert.assertEquals("https://rozetka.com.ua/ua/", driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0, 2000)", "");
        WebElement shareContainerfterReturning = driver
                .findElement(By
                        .xpath("//h2[contains (text(),'Акційні пропозиції')]//ancestor::rz-goods-section"));
        List<WebElement> shareCardAfter = shareContainerfterReturning.findElements(By.tagName("li"));
        Assert.assertEquals(shareCardAfter.size(), 6 ,"Акційні пропозиції doesn`t have 6 items");
        System.out.println(shareCardAfter.size());

    }
}
