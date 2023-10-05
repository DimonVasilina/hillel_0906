package ua.hillel.homeworks.hw12;

public class Hw12 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};
        int number = 11;
        int [] newArray = addArrayEl(a,number);
        for (int y = 0; y < newArray.length; y++) {
            System.out.print(newArray[y] + " ");
        }
        System.out.println();
        int [] newArray2 = addArrayEl2(a,number);
        for (int y = 0; y < newArray.length; y++) {
            System.out.print(newArray2[y] + " ");
        }
        System.out.println();

        int[] longArray = addArrayLotEl(a, number);
        for (int y = 0; y < longArray.length; y++) {
            System.out.print(longArray[y] + " ");
        }
    }

    public static int[] addArrayEl(int[] a, int number) {
        int[] arrayAddEl = new int[a.length + 1];
        for (int i = 0; i < arrayAddEl.length; i++) {
            if (i < a.length) {
                arrayAddEl[i] = a[i];
            }else {
                arrayAddEl[i] = number;
            }
        }
        return arrayAddEl;
    }

    public static int[] addArrayEl2(int[] a, int number) {
        int[] arrayAddEl = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            arrayAddEl[i] = a[i];
        }
        arrayAddEl[arrayAddEl.length - 1] = number;
        return arrayAddEl;
    }

    public static int[] addArrayLotEl(int[] a, int number) {
        int[] arrayAddLotEl = new int[number];
        int elArr = a[a.length - 1];
        for (int i = 0; i < number; i++) {
            if (i < a.length) {
                arrayAddLotEl[i] = a[i];
            } else {
                elArr += 1;
                arrayAddLotEl[i] = elArr;
            }
        }
        return arrayAddLotEl;
    }
}