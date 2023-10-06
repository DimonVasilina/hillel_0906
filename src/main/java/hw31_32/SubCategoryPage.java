package hw31_32;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubCategoryPage extends Locators {

    private WebDriver driver;

    public SubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleFirstProduct() {
        return driver.findElement(titleProduct).getText();
    }

    public SubCategoryPage addToBasketFromCard() {
        driver.findElement(addToBasketOnItemCard)
                .click();
        return new SubCategoryPage(driver);
    }
    public ProductPage getTopSalesFirstCard(){
        driver.findElement(topSalesFlag).click();
        return new ProductPage(driver);
    }
    public SubCategoryPage chooseSeller(){
        driver.findElement(sellerRozetka).click();
        return new SubCategoryPage(driver);
    }

    public SubCategoryPage chooseMaxPrice(String price){
        WebElement maxPriceInput = driver.findElement(maxPriceFild);
        maxPriceInput.clear();
        maxPriceInput.sendKeys(String.valueOf(price));
        return new SubCategoryPage(driver);
    }

    public SubCategoryPage submitSorting  (){
        driver.findElement(submitButton).click();
        return new SubCategoryPage(driver);
    }

}