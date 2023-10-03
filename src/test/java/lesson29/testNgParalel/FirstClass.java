package lesson29.testNgParalel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstClass {

    @DataProvider(name = "testData", parallel = true)
    public Object[][] dataProvFunc() {
        return new Object[][]{
                {"DataProvider 1"},
                {"DataProvider 2"},
                {"DataProvider 3"}
        };
    }

//    @Test(dataProvider = "testData")
//    public void test(String data) {
//        System.out.println("first class with dataProvider " + data + " " + Thread.currentThread().getId());
//    }

    @Test
    public void test() {
        System.out.println("first class " + Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.println("first class_second test " + Thread.currentThread().getId());
    }
}