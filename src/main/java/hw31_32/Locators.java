package hw31_32;

import org.openqa.selenium.By;

public class Locators {

    By titleProduct = By.cssSelector(".goods-tile__inner >a >span");
    By addToBasketOnItemCard = By.cssSelector(" app-buy-button");
    By sellerRozetka = By.xpath("//a[@data-id='Rozetka']");
    By maxPriceFild = By.xpath("//input[@formcontrolname='max']");
    By submitButton= By.xpath("//rz-scrollbar//button[@type='submit']");
    By topSalesFlag = By.xpath("//span[contains(text(),'ТОП ПРОДАЖІВ')]/ancestor::div[@class='goods-tile__inner']");
    By topSaleasFlagProductPage =
       By.xpath("(//*[@class='simple-slider__holder carousel']//span[contains(text(),'ТОП ПРОДАЖІВ')])[2]");
}
