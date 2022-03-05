package test;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.cos(0));
        System.out.println(Math.acos(0));
        System.out.println(GetRandomChar('a','z'));
    }

    private static char GetRandomChar(char a, char z) {
        return (char)(a+Math.random()*(a-z+1));
    }
}
