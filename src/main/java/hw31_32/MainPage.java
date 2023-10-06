package hw31_32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    By laptopsAndComputersByMenu = By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]");


    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public CategoryPage selectCategory(){
        driver.findElement(laptopsAndComputersByMenu).click();
        return new CategoryPage(driver);
    }
}
