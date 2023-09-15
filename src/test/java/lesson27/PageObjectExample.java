package lesson27;

//        На главной странице в инпут поиск ввести Мас
//        Сохранить тайтл первого товара в поисковой выдаче
//        Перейти на продуктовую страницу первого товара
//        Проверить, что тайтл на поисковой выдаче соответсвует тайтлу на продктовой странице

import init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.page.object.MainPageLogic;
import ua.page.object.SearchPageLogic;

public class PageObjectExample extends InitialDriver {

    @Test
    public void testWithPageObject() {
        String tittleFirstProductFromSearchPage = new MainPageLogic(driver)
                .typeTextToInputSearch("Mac")
                .clickSearchBtn()
                .getFirstProductTittle();
        String tittleOfProductOnProductPage = new SearchPageLogic(driver)
                .clickOnFirstProduct()
                .getTittleOfProduct();

        Assert.assertEquals(tittleFirstProductFromSearchPage, tittleOfProductOnProductPage);

    }
}
