package ua.page.selenide;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class CategoryPageLocators {

    ElementsCollection subCategories = $$(By.xpath("//a[contains(@class, 'tile-cats__heading')]"));
}