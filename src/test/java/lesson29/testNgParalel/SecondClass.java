package lesson29.testNgParalel;

import org.testng.annotations.Test;

public class SecondClass {

    @Test
    public void test() {
        System.out.println("second class " + Thread.currentThread().getId());
    }
}