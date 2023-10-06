package hw31_32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    By laptopsSubCategory = By.xpath("//a[@title='Ноутбуки']");
    private WebDriver driver;
    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public SubCategoryPage selectSubCategory(){
        driver.findElement(laptopsSubCategory).click();
        return new SubCategoryPage(driver);
    }


}
