package test;

import java.util.Arrays;

public class arraypratice {
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 4, 5, 6, 7, 9, 10};
        int arr2[] = new int[5];
        arr2 = Arrays.copyOfRange(arr1, 0, 4);
        show(arr1);
        System.out.println();
        show(arr2);
        System.out.println();
        getMin(arr1);
        String arr[] = new String[]{"aa", "cc", "ff", "gg", "hhh"};
        show(arr);
        System.out.println();
        System.out.println("替换后：");
        instead(arr, 2, "bb");
        show(arr);
        System.out.println();
        int array[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        showArray(array);
        System.out.println("反转后：");
        reserveArray(array);
    }

    public static void showArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void reserveArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + "   ");
            }
            System.out.println();
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void show(String[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("数组中最小的数：" + min);
    }

    public static void instead(String[] array, int i, String n) {
        array[i] = n;
    }
}
