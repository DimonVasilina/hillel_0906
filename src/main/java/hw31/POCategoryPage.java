package hw31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POCategoryPage {
    By laptopsSubCategory = By.xpath("//a[@title='Ноутбуки']");
    private WebDriver driver;
    public  POCategoryPage (WebDriver driver) {
        this.driver = driver;
    }

    public POSubCategoryPage goToSubCategoryClick (){
        driver.findElement(laptopsSubCategory).click();
        return new POSubCategoryPage(driver);
    }


}
