package test;

public class integer {
    public static void main(String[] args) {
        int a = 22;
        String a1 = Integer.toBinaryString(a);
        System.out.println(a1);
        String a2 = Integer.toHexString(a);
        System.out.println(a2);
        String a3 = Integer.toOctalString(a);
        System.out.println(a3);
        int a4 = Integer.MAX_VALUE;
        System.out.println(a4);

    }
}
