import java.util.Scanner;

public class helloworlk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数据：");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("两个数的和：" + c);
        if (a == b)
            System.out.println("两个数相等。");
        else
            System.out.println("两个数不等");
        if (a > b && a > c)
            System.out.println(a);
        else if (b > a && b > c)
            System.out.println(b);
        else
            System.out.println(c);

    }
}
