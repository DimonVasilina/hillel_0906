package lesson26;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class KeysExample extends InitialDriver {

    @Test
    public void keysTest() {
        driver.get("https://www.google.com.ua/");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys(Keys.chord(Keys.SHIFT, "hello"));
        input.sendKeys(Keys.ENTER);


    }
}
//        Открыть https://rozetka.com.ua/
//        Проверить, что в блоке Акционные предложения отображается 6 товаров
//        Сохранить цену первого товара
//        Перейти на продуктовую первого товара и проверить, что цена совпадает с сохраненной
//        Вернуться на главную страницу (проверка URL)
//        Проверить, что в блоке Акционные предложения отображается 6 товаров