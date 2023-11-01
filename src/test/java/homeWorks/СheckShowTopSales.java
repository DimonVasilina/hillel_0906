package homeWorks.hw32;


import init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homeworks.hw31_32.MainPage;

public class СheckShowTopSales extends InitialDriver {

    @Test
    public void СheckShowTopSalesOnProductPage() {
        driver.get("https://rozetka.com.ua/ua/");
        boolean flagTopSales = new MainPage(driver)
                .selectCategory().selectSubCategory()
                .chooseSeller().chooseMaxPrice("100000").submitSorting()
                .getTopSalesFirstCard().checkShowTopSalesFlag();
        Assert.assertTrue (flagTopSales, "ТОП ПРОДАЖ is not displayed");
    }
}
