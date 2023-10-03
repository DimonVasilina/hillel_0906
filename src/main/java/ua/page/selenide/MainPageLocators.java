package ua.page.selenide;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class MainPageLocators {

    ElementsCollection categoriesSideBar = $$(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li"));
}