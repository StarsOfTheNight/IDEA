package test;

public class sum {
    public static void main(String[] args) {
        int array[] = new int[]{113, 23, 22, 11, 55, 28, 19, 27, 7, 9, 18};
        show(array);
        reserve(array);
        System.out.println();
        show(array);
        /**int sum = 0;
         for (int i = 0; i < array.length; i++) {
         if (array[i] % 10 != 7 && array[i] / 10 % 10 != 7 && array[i] % 2 == 0) {
         sum += array[i];
         }
         }
         System.out.println(sum);*/
      /*  for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
        System.out.println();*/
      /*  for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }*/


    }

    public static void show(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
    }

    public static void reserve(int array[]) {
        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
       /* for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length / 2 - 1 - i];
            array[array.length / 2 - 1 - i] = temp;
        }*/
    }
}
