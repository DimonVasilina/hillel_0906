package homeWorks.hw25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.InitDriver;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceRozetka extends InitDriver {
    @Test
    public void savePriseFromFirstPageOfLaptops () throws IOException {

        driver.get("https://rozetka.com.ua/ua/");
        WebElement laptopsAndComputers = driver
                .findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopsAndComputers.click();
        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки']"));
        laptops.click();
        List<WebElement> productCard = driver
                .findElements(By.xpath("//div[@class='goods-tile ng-star-inserted']"));
        Map<String, Integer> rozetkaPrice = new HashMap<>();

        for (WebElement productCardEl : productCard) {
            WebElement finalPrice = productCardEl.findElement(By.cssSelector(".ng-star-inserted .goods-tile__price-value"));
            WebElement titleProduct = productCardEl.findElement(By.cssSelector(".goods-tile__title"));

            String titleText = titleProduct.getText();
            String strFinalPrice = finalPrice.getAttribute("textContent").replace("₴", "")
                    .replaceAll("[^\\d]", "");
            int intFinalPrice = Integer.valueOf(strFinalPrice);
            rozetkaPrice.put(titleText, intFinalPrice);
        }

        FileWriter fileWriter = new FileWriter("rozetkaTest.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        for (Map.Entry<String, Integer> entry : rozetkaPrice.entrySet()) {
            writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
        }

        writer.close();
        fileWriter.close();
    }
}