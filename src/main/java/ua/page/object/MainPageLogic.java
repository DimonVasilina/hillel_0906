package ua.page.object;

import org.openqa.selenium.WebDriver;

public class MainPageLogic extends MainPageLocators {

    private WebDriver driver;

    public MainPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public MainPageLogic typeTextToInputSearch(String text) {
        driver.findElement(searchInput)
                .sendKeys(text);
        return this;
    }

    public SearchPageLogic clickSearchBtn() {
        driver.findElement(btnSearch).click();
        return new SearchPageLogic(driver);
    }

}
