package ua.hillel.homeworks.hw3;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {

        //sumVarPlusName();
        //checkNum();
        checkPluralNum();

    }

    public static void sumVarPlusName(){
        System.out.println("Enter first integer");
        Scanner scannerNum = new Scanner(System.in);
        int firstNum = scannerNum.nextInt();
        System.out.println("Enter second integer");
        int secondNum = scannerNum.nextInt();
        int sumNum = firstNum + secondNum;

        System.out.println("Enter Your name");
        Scanner scannerChar = new Scanner(System.in);
        String name = scannerChar.nextLine();
        System.out.println(name + " " + sumNum);

    }
    public static void checkNum(){
        System.out.println("Please, enter number '1'");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int num = 1;
        if (num == inputNum){
            System.out.println("You entered number " +  inputNum);
        }else {
            System.out.println("You entered a number other than " + num);
        }
    }
    public static void checkPluralNum(){
        System.out.println("Please, enter one of the numbers  '1', '2', '3'");
        Scanner scanner = new Scanner(System.in);
        int  inputNum = scanner.nextInt();
        if (inputNum < 1|| inputNum > 3){
            System.out.println("You entered a number other than '1', '2', '3'");
        } else {
            System.out.println("You entered number " +  inputNum);

        }


    }
}