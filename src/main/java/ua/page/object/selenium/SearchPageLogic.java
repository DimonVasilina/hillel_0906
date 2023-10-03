package ua.page.object.selenium;

import org.openqa.selenium.WebDriver;

public class SearchPageLogic extends SearchPageLocators {


    private WebDriver driver;

    public SearchPageLogic(WebDriver driver) {
        this.driver = driver;
    }


    public String getFirstProductTittle() {
        return driver.findElement(firstProductTittle).getText().trim();
    }

    public ProductPageLogic clickOnFirstProduct() {
        driver.findElement(firstProductTittle).click();
        return new ProductPageLogic(driver);
    }

}