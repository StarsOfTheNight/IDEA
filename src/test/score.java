package test;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        int array[] = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入" + (i + 1) + "位评委的评分：");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        int min = getMin(array);
        System.out.println("最小:" + min);
        int max = getMax(array);
        System.out.println("最大:" + max);
        double sum = sum(array);
        System.out.println(sum - max - min);
        System.out.println(max + min);
        System.out.print("平均分：");
        double averagescore = (sum - max - min) / (array.length - 2);
        System.out.println(averagescore);
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }

    public static double sum(int array[]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getMax(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

}
