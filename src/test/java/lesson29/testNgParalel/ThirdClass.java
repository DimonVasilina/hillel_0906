package lesson29.testNgParalel;

import org.testng.annotations.Test;

public class ThirdClass {

    @Test
    public void test() {
        System.out.println("third class " + Thread.currentThread().getId());
    }
}