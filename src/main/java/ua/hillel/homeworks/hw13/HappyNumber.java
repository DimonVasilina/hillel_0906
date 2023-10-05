package ua.hillel.homeworks.hw13;

public class HappyNumber {
    public static void main(String[] args) {

        int[] numberArray = {1, 23, 22244, 22, 9};
        int happyNumber = chooseNumber(numberArray);
        System.out.println(happyNumber + " Вот счастливое число!");
        chooseNumber2(numberArray);
    }
    public static int chooseNumber(int[] numberArray) {
        int happynumber = 0;
        for (int i = 0; i < numberArray.length; i++) {
            happynumber = numberArray[i];
            if (i == 2) {
                break;
            }
        }
        return happynumber;
    }
    public static void chooseNumber2(int[] numberArray) {
        int happynumber = 0;
        for (int i = 0; i < numberArray.length; i++) {
            happynumber = numberArray[i];
            if (i >1) {
                break;
            }
        }
        System.out.println(happynumber + " Вот счастливое число 2!");
    }
}