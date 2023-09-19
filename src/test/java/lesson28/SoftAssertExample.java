package lesson28;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void simpleAssertExample() {

        System.out.println("Simple assert - first assert");
        Assert.assertEquals(5, 5);
        System.out.println("Simple assert - second assert");
        Assert.assertTrue("Hello".equals("hello"));
    }
        @Test
    public void softAssertExample(){
        SoftAssert softAssert = new SoftAssert();
            System.out.println("Simple assert - first assert");
            softAssert.assertEquals(5, 23);

            System.out.println("Simple assert - second assert");
            softAssert.assertTrue("Hello".equals("hello"));

            System.out.println("Soft assert - thrid assert");
            softAssert.assertEquals(5,7);
            softAssert.assertAll();
    }
}
