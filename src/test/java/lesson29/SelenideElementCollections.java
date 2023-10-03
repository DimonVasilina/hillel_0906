package lesson29;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;

public class SelenideElementCollections {

    @Test
    public void testCountCategoriesSideBar(){
        ElementsCollection sideBarCategories =
                $$(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li"));

        int size = sideBarCategories.size();
        System.out.println(size);

        Assert.assertEquals(17, size);

        sideBarCategories.shouldHave(CollectionCondition.size(17));
    }


    @Test
    public void testGetElementTextCategoriesSideBar(){
        ElementsCollection sideBarCategories =
                $$(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li"));
        String textFromFirstElement = sideBarCategories.get(1).getText();
        System.out.println(textFromFirstElement);
    }

    @Test
    public void testFilterElementTextCategoriesSideBar(){
        ElementsCollection sideBarCategories =
                $$(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li"));
        ElementsCollection filteredSideBarCategories = sideBarCategories
                .filterBy(Condition.text("Ноутбуки и компьютеры"));
        System.out.println(filteredSideBarCategories.size());

    }
}