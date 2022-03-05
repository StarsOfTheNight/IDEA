package test;

public class array {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 2, 3, 2, 1};
        for (int i = 1; i < array.length; i++) {
            int index = 0;
            for (int j = 1; j <=array.length - i; j++)
                if (array[j] > array[index])
                    index = j;
            int temp = array[array.length - i];
            array[array.length - i] = array[index];
            array[index] = temp;

        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
        /**
         int newarray[] = Arrays.copyOf(array, 3);
         System.out.print("[");
         for (int i = 0; i < newarray.length; i++) {
         System.out.print(newarray[i]);
         if (i < newarray.length - 1)
         System.out.print(",");
         }
         System.out.println("]");
         Arrays.sort(array);
         for (int i = 0; i < array.length; i++) {
         System.out.print(array[i]);
         System.out.print("  ");
         }
         System.out.println();
         int index = Arrays.binarySearch(array,1);
         System.out.println("要查询数据的索引位置："+index);

         */
    }

}
