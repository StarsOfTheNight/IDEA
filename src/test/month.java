package test;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：(1-12)");
        int mon = scanner.nextInt();
        switch (mon) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fill");
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
        }
        /** if(mon>=3&&mon<=5)
         System.out.println("spring");
         else if (mon>=6&&mon<=8)
         System.out.println("summer");
         else if(mon>=9&&mon<=12)
         System.out.println("fill");
         else
         System.out.println("winter");*/
    }
}
