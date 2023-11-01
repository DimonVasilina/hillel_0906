package homeWorks.hw33_selenideTest;

import ua.hillel.homeworks.hw33_selenide.BasketSelenide;
import ua.hillel.homeworks.hw33_selenide.HeaderSelenide;
import ua.hillel.homeworks.hw33_selenide.MainPageSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.open;

public class AddToBasket {

    @Test
    public void checkAddToBasketSelenide() {
        open("https://www.rozetka.com.ua/");
        String titleFirstProduct = new MainPageSelenide().goToCategory("Ноутбуки и компьютеры")
                .goToSubCategory("Ноутбуки").addToBasket().getTitleProduct();
        String counterBasket = new HeaderSelenide().getCounterBasket();
        boolean checkBasketcaunter = counterBasket.equals("1");
        Assert.assertTrue(checkBasketcaunter, "Basket counter isn`t correct");
        String titleProductInBasket = new HeaderSelenide().goToBasket().getTitleInBasket();
        String countOfItemInBasket = new BasketSelenide().getCountItem();
        Assert.assertEquals(titleFirstProduct, titleProductInBasket, "Title aren`t equals");
        Assert.assertEquals(counterBasket, countOfItemInBasket, "Added to Basket mostly");
    }
}
