package test;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {

        Random ran = new Random();
        int num = ran.nextInt(10) + 1;
        while (true) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            if (a == num) {
                System.out.println("猜对了");
                break;
            } else if (a > num)
                System.out.println("大了");
            else
                System.out.println("小了");
        }


    }
}
