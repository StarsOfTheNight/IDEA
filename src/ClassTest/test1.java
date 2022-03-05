package ClassTest;

public class test1 extends test{
    private int a;
    test1(){
        System.out.println("test1无参构造函数");
    }

    test1(int a){
        super(1);
        this.a=a;
        System.out.println("test1有参构造函数");
    }
}
