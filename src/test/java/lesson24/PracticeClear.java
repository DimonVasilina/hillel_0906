package lesson24;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PracticeClear extends InitialDriver {

//
//    Открыть https://rozetka.com.ua/
//    Перейти в раздел «Компьютеры и ноутбуки»
//    Перейти в раздел « Ноутбуки»
//    Добавить первый товар в корзину
//    Проверить что в корзину добавился один товар
//    Перейти в корзину и проверить, что добавился правильный товар

    @Test
    public void submitTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920, 860));
        driver.get("https://www.google.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("q"));
        inputSearch.sendKeys("QA");
        sleep(5000);
        inputSearch.clear();
        sleep(5000);
    }
}
