package ClassTest;

public class test {
    private int a;
    test(){
        System.out.println("test无参构造函数");
    }
    test(int a){
        this.a=a;
        System.out.println("test有参构造函数");
    }
}
