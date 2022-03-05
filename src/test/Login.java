package test;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String name = scanner.nextLine();
            if (!(name.equals(username))) {
                System.out.println("请输入正确的用户名");
                continue;
            } else {
                System.out.println("请输入密码：");
                for (int i = 1; i <= 3; i++) {

                    String pwd = scanner.nextLine();
                    if (name.equals(username) && pwd.equals(password)) {
                        System.out.println("登录成功");
                        break;
                    } else {
                        System.out.println("密码错误，你还有" + (3 - i) + "次机会,");
                        System.out.println("请重新输入密码：");
                        continue;
                    }
                }
            }
            break;
        }
    }
}
