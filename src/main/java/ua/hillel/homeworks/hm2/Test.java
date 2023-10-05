package ua.hillel.homeworks.hm2;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        int num1 = 5;
        int num2 = 5;

        if (num1 <= num2) {
            System.out.println(num1);
        } else {

            System.out.println(num2);
        }
        System.out.flush();


        int firstVariable = 7;
        int secondVariable = 8;
        System.out.println(firstVariable + secondVariable);


        int alex = 7;
        int maks = 9;
        int sumAM = alex + ++maks;
        System.out.println(sumAM);
        int aMSum = alex + maks++;
        System.out.println(aMSum);
    }

}






