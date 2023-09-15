package ua.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageLocators {

    By searchInput = By.name("search");
    By btnSearch = By.xpath("//button[contains(@class, 'search-form__submit')]");

}
