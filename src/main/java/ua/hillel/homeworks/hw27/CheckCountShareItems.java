package ua.hillel.homeworks.hw27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.InitDriver;

import java.util.List;


public class CheckCountShareItems extends InitDriver {

    @Test
    public void checkCountShareItems() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/ua/");

        WebElement shareContainer = findShareContainer();
        boolean isVisibleShare = false;

        List<WebElement> shareCard = shareContainer.findElements(By.tagName("li"));
        Assert.assertEquals(shareCard.size(), 6, "Акційні пропозиції doesn't have 6 items");
        WebElement priceFirstShareItem = shareCard
                .get(0).findElement(By.xpath("//div[contains(@class, 'tile__price tile')]"));
        String countPriceMainPage = priceFirstShareItem.getText();
        shareCard.get(0).click();

        WebElement priceProductCard = driver
                .findElement(By
                        .xpath("//p[@class='product-price__big product-price__big-color-red']"));
        String countPriceProductCard = priceProductCard.getText();
        Assert.assertEquals(countPriceProductCard, countPriceMainPage, "Price doesn't equal");

        driver.navigate().back();

        Assert.assertEquals("https://rozetka.com.ua/ua/", driver.getCurrentUrl());


        while (!isVisibleShare) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("window.scrollBy(0, 2000)", "");
            //  Thread.sleep(1000);
            shareContainer = findShareContainer(); // Оновлення елементу після скролу
            isVisibleShare = isVisibleShare(driver, shareContainer);

        }
        List<WebElement> shareCardAfter = shareContainer.findElements(By.tagName("li"));
        Assert.assertEquals(shareCardAfter.size(), 6, "Акційні пропозиції doesn't have 6 items");
    }

    private WebElement findShareContainer() {
        WebElement shareContainer = driver.findElement(By.xpath("//h2[contains (text(),'Акційні пропозиції')]//ancestor::rz-goods-section"));
        return shareContainer;
    }

    private boolean isVisibleShare(WebDriver driver, WebElement shareContainer) {
        boolean isVisibleShare = shareContainer.isDisplayed();
        return isVisibleShare;
    }
}