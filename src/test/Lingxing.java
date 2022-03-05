package test;

public class Lingxing {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                // System.out.print("*");
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= i; k++)
                System.out.print(" ");
            for (int j = 7; j >= 2 * i - 1; j--) {
                //System.out.print("*");
                if (j == 7 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }


    }
}
