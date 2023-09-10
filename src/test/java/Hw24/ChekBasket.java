package Hw24;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class ChekBasket extends InitialDriver{
        @Test
        public void checkChoosenItemInBasket ()  {
            String titleText = "1";
            driver.get("https://rozetka.com.ua/ua/");
            WebElement laptopsAndComputers = driver
                    .findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
            laptopsAndComputers.click();
            WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки']"));
            laptops.click();
            List<WebElement> productCard = driver
                    .findElements(By.xpath("(//div[@class='goods-tile ng-star-inserted'])[1]"));
            for (WebElement productCardEl : productCard) {
                WebElement basketButton = productCardEl.findElement(By.cssSelector("app-buy-button"));
                WebElement titleProduct = productCardEl.findElement(By.cssSelector(".goods-tile__title"));

                titleText = titleProduct.getText();
                basketButton.click();
            }
            WebElement basketCounter = driver.findElement(By.xpath("//rz-icon-badge//span"));
            String basketCount = basketCounter.getAttribute("innerText");
            Assert.assertEquals(basketCount, "1", "counter is not equals 1");
            WebElement basketButton = driver.findElement(By.xpath("//rz-cart//button"));
            basketButton.click();
            WebElement itemTitleInBasket = driver.findElement(By.xpath("//a[@data-testid='title']"));
            String titleProductInBasket = itemTitleInBasket.getText();

            Assert
                    .assertEquals(titleText,titleProductInBasket
                            , "Product title in the basket different from choosen Product title");
        }
    }
