package lesson25;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeSelected extends InitialDriver {

    @Test
    public void selectedTest(){
        driver.get("https://rozetka.com.ua/");
        WebElement loginBtn = driver
                .findElement(By.xpath("//button[@class='header__button ng-star-inserted']"));
        loginBtn.click();
        WebElement labelRememberMe = driver
                .findElement(By.xpath("//*[@class='auth-modal__remember-checkbox']"));
        WebElement inputRememberMe = driver.findElement(By.id("remember_me"));

        Assert.assertTrue(inputRememberMe.isSelected());

        System.out.println(inputRememberMe.isSelected());//true
        labelRememberMe.click();
        System.out.println(inputRememberMe.isSelected());//false


    }
}
