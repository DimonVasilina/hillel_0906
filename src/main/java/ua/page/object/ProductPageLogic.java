package ua.page.object;


import org.openqa.selenium.WebDriver;

public class ProductPageLogic extends ProductPageLocators {

    private WebDriver driver;

    public ProductPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String getTittleOfProduct(){
        return driver.findElement(productTittle).getAttribute("innerText");
    }

}
